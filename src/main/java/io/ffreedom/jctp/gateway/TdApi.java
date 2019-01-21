package io.ffreedom.jctp.gateway;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.core.util.FileUtil;
import io.ffreedom.common.utils.ThreadUtil;
import io.ffreedom.jctp.gateway.config.TdApiConfig;
import io.ffreedom.jctp.gateway.dto.ReqCancelOrder;
import io.ffreedom.jctp.gateway.dto.ReqOrder;
import io.ffreedom.jctp.jni.td.CThostFtdcInputOrderActionField;
import io.ffreedom.jctp.jni.td.CThostFtdcInputOrderField;
import io.ffreedom.jctp.jni.td.CThostFtdcQryInvestorPositionField;
import io.ffreedom.jctp.jni.td.CThostFtdcQryTradingAccountField;
import io.ffreedom.jctp.jni.td.CThostFtdcReqAuthenticateField;
import io.ffreedom.jctp.jni.td.CThostFtdcReqUserLoginField;
import io.ffreedom.jctp.jni.td.CThostFtdcTraderApi;
import io.ffreedom.jctp.jni.td.jctptraderapiv6v3v11x64Constants;

public class TdApi {

	private Logger log = LoggerFactory.getLogger(getClass());

	private volatile CThostFtdcTraderApi cThostFtdcTraderApi;

	private volatile boolean isConnecting = false; // 是否正在连接中
	private volatile boolean isConnected = false; // 连接状态
	private volatile boolean isLogin = false; // 登陆状态

	private String tdAddress;
	private String brokerId;
	private String userId;
	private String password;
	private String authCode;
	private String userProductInfo;
	private String gatewayId;

	private TdSpi tdSpi;

	public TdApi(String gatewayId, TdSpi tdSpi, TdApiConfig config) {
		this.gatewayId = gatewayId;
		this.tdSpi = tdSpi;
		this.tdAddress = config.getTdAddress();
		this.brokerId = config.getBrokerId();
		this.userId = config.getUserId();
		this.password = config.getPassword();
		this.authCode = config.getAuthCode();
	}

	/**
	 * 连接
	 */
	synchronized void connect() {
		if (isConnected() || isConnecting)
			return;
		if (cThostFtdcTraderApi != null) {
			cThostFtdcTraderApi.RegisterSpi(null);
			// 由于CTP底层原因，部分情况下不能正确执行Release
			ThreadUtil.startNewThread(() -> apiRelease(), gatewayId + "-TdApiReleaseThread-" + LocalDateTime.now());
			ThreadUtil.sleep(2000);
			isConnecting = false;
			isConnected = false;
			isLogin = false;
		}

		log.warn("{} 交易接口实例初始化", gatewayId);
		String envTmpDir = System.getProperty("java.io.tmpdir");
		String tempFilePath = envTmpDir + File.separator + "jctp" + File.separator + "TEMP" + File.separator + "TD_"
				+ gatewayId;
		File tempFile = new File(tempFilePath);
		FileUtil.createMissingParentDirectories(tempFile);

		log.info("{} 使用临时文件夹{}", gatewayId, tempFile.getParentFile().getAbsolutePath());
		cThostFtdcTraderApi = CThostFtdcTraderApi.CreateFtdcTraderApi(tempFile.getAbsolutePath());
		cThostFtdcTraderApi.RegisterSpi(tdSpi);
		cThostFtdcTraderApi.RegisterFront(tdAddress);
		isConnecting = true;
		cThostFtdcTraderApi.Init();
	}

	/**
	 * 关闭
	 */
	synchronized void close() {
		if (cThostFtdcTraderApi != null) {
			log.info("{} TdApi close and release start.", gatewayId);
			cThostFtdcTraderApi.RegisterSpi(null);
			// 避免异步线程找不到引用
			// CThostFtdcTraderApi cThostFtdcTraderApiForRelease = cThostFtdcTraderApi;
			// 由于CTP底层原因，部分情况下不能正确执行Release
			ThreadUtil.startNewThread(() -> apiRelease(), gatewayId + "-TdApiReleaseThread-" + LocalDateTime.now());
			ThreadUtil.sleep(2000);
			cThostFtdcTraderApi = null;
			isConnecting = false;
			isConnected = false;
			isLogin = false;
			log.info("{} TdApi instance close and release end.", gatewayId);
			// 通知停止其他关联实例
		} else
			log.warn("{} TdApi instance is null.", gatewayId);
	}

	private void apiRelease() {
		try {
			log.info("{} TdApi release thread start...", gatewayId);
			cThostFtdcTraderApi.Release();
		} catch (Exception e) {
			log.error("{} TdApi release thread error...", gatewayId, e);
		}
	}
	
	/**
	 * 查询账户
	 */
	void queryAccount() {
		if (cThostFtdcTraderApi == null) {
			log.info("{}尚未初始化,无法查询账户", gatewayId);
			return;
		}
		CThostFtdcQryTradingAccountField cThostFtdcQryTradingAccountField = new CThostFtdcQryTradingAccountField();
		cThostFtdcTraderApi.ReqQryTradingAccount(cThostFtdcQryTradingAccountField, reqID.incrementAndGet());
	}

	/**
	 * 查询持仓
	 */
	void queryPosition() {
		if (cThostFtdcTraderApi == null) {
			log.info("{}尚未初始化,无法查询持仓", gatewayId);
			return;
		}

		if (!instrumentQueried) {
			log.info("{}交易接口尚未获取到合约信息,无法查询持仓", gatewayId);
			return;
		}

		CThostFtdcQryInvestorPositionField cThostFtdcQryInvestorPositionField = new CThostFtdcQryInvestorPositionField();
		// log.info("查询持仓");
		cThostFtdcQryInvestorPositionField.setBrokerID(brokerId);
		cThostFtdcQryInvestorPositionField.setInvestorID(userId);
		cThostFtdcTraderApi.ReqQryInvestorPosition(cThostFtdcQryInvestorPositionField, reqID.incrementAndGet());
	}

	/**
	 * 发单
	 * 
	 * @param orderReq
	 * @return
	 */
	String sendOrder(ReqOrder orderReq) {
		if (cThostFtdcTraderApi == null) {
			log.info("{}尚未初始化,无法发单", gatewayId);
			return null;
		}
		CThostFtdcInputOrderField cThostFtdcInputOrderField = new CThostFtdcInputOrderField();
		orderRef.incrementAndGet();
		cThostFtdcInputOrderField.setInstrumentID(orderReq.getSymbol());
		cThostFtdcInputOrderField.setLimitPrice(orderReq.getPrice());
		cThostFtdcInputOrderField.setVolumeTotalOriginal(orderReq.getVolume());

		cThostFtdcInputOrderField.setOrderPriceType(
				CtpConstant.priceTypeMap.getOrDefault(orderReq.getPriceType(), Character.valueOf('\0')));
		cThostFtdcInputOrderField
				.setDirection(CtpConstant.directionMap.getOrDefault(orderReq.getDirection(), Character.valueOf('\0')));
		cThostFtdcInputOrderField.setCombOffsetFlag(
				String.valueOf(CtpConstant.offsetMap.getOrDefault(orderReq.getOffset(), Character.valueOf('\0'))));
		cThostFtdcInputOrderField.setOrderRef(orderRef.get() + "");
		cThostFtdcInputOrderField.setInvestorID(userId);
		cThostFtdcInputOrderField.setUserID(userId);
		cThostFtdcInputOrderField.setBrokerID(brokerId);

		cThostFtdcInputOrderField
				.setCombHedgeFlag(String.valueOf(jctptraderapiv6v3v11x64Constants.THOST_FTDC_HF_Speculation));
		cThostFtdcInputOrderField.setContingentCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_CC_Immediately);
		cThostFtdcInputOrderField.setForceCloseReason(jctptraderapiv6v3v11x64Constants.THOST_FTDC_FCC_NotForceClose);
		cThostFtdcInputOrderField.setIsAutoSuspend(0);
		cThostFtdcInputOrderField.setTimeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_TC_GFD);
		cThostFtdcInputOrderField.setVolumeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_VC_AV);
		cThostFtdcInputOrderField.setMinVolume(1);

		// 判断FAK FOK市价单
		if (Constant.PRICETYPE_FAK.equals(orderReq.getPriceType())) {
			cThostFtdcInputOrderField.setOrderPriceType(jctptraderapiv6v3v11x64Constants.THOST_FTDC_OPT_LimitPrice);
			cThostFtdcInputOrderField.setTimeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_TC_IOC);
			cThostFtdcInputOrderField.setVolumeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_VC_AV);
		} else if (Constant.PRICETYPE_FOK.equals(orderReq.getPriceType())) {
			cThostFtdcInputOrderField.setOrderPriceType(jctptraderapiv6v3v11x64Constants.THOST_FTDC_OPT_LimitPrice);
			cThostFtdcInputOrderField.setTimeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_TC_IOC);
			cThostFtdcInputOrderField.setVolumeCondition(jctptraderapiv6v3v11x64Constants.THOST_FTDC_VC_CV);
		}

		cThostFtdcTraderApi.ReqOrderInsert(cThostFtdcInputOrderField, reqID.incrementAndGet());
		String rtOrderID = gatewayId + "." + orderRef.get();

		if (StringUtils.isNotBlank(orderReq.getOriginalOrderID()))
			originalOrderIdMap.put(rtOrderID, orderReq.getOriginalOrderID());

		return rtOrderID;
	}

	// 撤单
	void cancelOrder(ReqCancelOrder reqCancelOrder) {
		if (cThostFtdcTraderApi == null) {
			log.info("{}尚未初始化,无法撤单", gatewayId);
			return;
		}
		CThostFtdcInputOrderActionField cThostFtdcInputOrderActionField = new CThostFtdcInputOrderActionField();

		cThostFtdcInputOrderActionField.setInstrumentID(reqCancelOrder.getSymbol());
		cThostFtdcInputOrderActionField.setExchangeID(reqCancelOrder.getExchange());
		cThostFtdcInputOrderActionField.setOrderRef(reqCancelOrder.getOrderID());
		cThostFtdcInputOrderActionField.setFrontID(reqCancelOrder.getFrontID());
		cThostFtdcInputOrderActionField.setSessionID(reqCancelOrder.getSessionID());

		cThostFtdcInputOrderActionField.setActionFlag(jctptraderapiv6v3v11x64Constants.THOST_FTDC_AF_Delete);
		cThostFtdcInputOrderActionField.setBrokerID(brokerId);
		cThostFtdcInputOrderActionField.setInvestorID(userId);

		cThostFtdcTraderApi.ReqOrderAction(cThostFtdcInputOrderActionField, reqID.incrementAndGet());
	}

	void login() {
		if (loginFailed) {
			log.warn(gatewayId + "交易接口登录曾发生错误,不再登录,以防被锁");
			return;
		}

		if (cThostFtdcTraderApi == null) {
			log.warn("{} 交易接口实例已经释放", gatewayId);
			return;
		}

		if (StringUtils.isEmpty(gatewayId) || StringUtils.isEmpty(gatewayId) || StringUtils.isEmpty(password)) {
			log.error(gatewayId + "BrokerID UserID Password不允许为空");
			return;
		}

		if (!StringUtils.isEmpty(authCode) && !authStatus) {
			// 验证
			CThostFtdcReqAuthenticateField authenticateField = new CThostFtdcReqAuthenticateField();
			authenticateField.setAuthCode(authCode);
			authenticateField.setUserID(userId);
			authenticateField.setBrokerID(brokerId);
			authenticateField.setUserProductInfo(userProductInfo);
			cThostFtdcTraderApi.ReqAuthenticate(authenticateField, reqID.incrementAndGet());
		} else {
			// 登录
			CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
			userLoginField.setBrokerID(brokerId);
			userLoginField.setUserID(userId);
			userLoginField.setPassword(password);
			cThostFtdcTraderApi.ReqUserLogin(userLoginField, 0);
		}
	}

	/**
	 * 返回接口状态
	 * 
	 * @return
	 */
	boolean isConnected() {
		return isConnected;
	}

	void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	boolean isLogin() {
		return isLogin;
	}

	void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

}
