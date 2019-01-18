/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcTraderOfferField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcTraderOfferField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTraderOfferField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTraderOfferField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TraderID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ParticipantID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_Password_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_InstallID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_OrderLocalID_set(swigCPtr, this, value);
	}

	public String getOrderLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_OrderLocalID_get(swigCPtr, this);
	}

	public void setTraderConnectStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TraderConnectStatus_set(swigCPtr, this, value);
	}

	public char getTraderConnectStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TraderConnectStatus_get(swigCPtr, this);
	}

	public void setConnectRequestDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectRequestDate_set(swigCPtr, this, value);
	}

	public String getConnectRequestDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectRequestDate_get(swigCPtr, this);
	}

	public void setConnectRequestTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectRequestTime_set(swigCPtr, this, value);
	}

	public String getConnectRequestTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectRequestTime_get(swigCPtr, this);
	}

	public void setLastReportDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_LastReportDate_set(swigCPtr, this, value);
	}

	public String getLastReportDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_LastReportDate_get(swigCPtr, this);
	}

	public void setLastReportTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_LastReportTime_set(swigCPtr, this, value);
	}

	public String getLastReportTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_LastReportTime_get(swigCPtr, this);
	}

	public void setConnectDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectDate_set(swigCPtr, this, value);
	}

	public String getConnectDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectDate_get(swigCPtr, this);
	}

	public void setConnectTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectTime_set(swigCPtr, this, value);
	}

	public String getConnectTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_ConnectTime_get(swigCPtr, this);
	}

	public void setStartDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_StartDate_set(swigCPtr, this, value);
	}

	public String getStartDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_StartDate_get(swigCPtr, this);
	}

	public void setStartTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_StartTime_set(swigCPtr, this, value);
	}

	public String getStartTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_StartTime_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_TradingDay_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_BrokerID_get(swigCPtr, this);
	}

	public void setMaxTradeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_MaxTradeID_set(swigCPtr, this, value);
	}

	public String getMaxTradeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_MaxTradeID_get(swigCPtr, this);
	}

	public void setMaxOrderMessageReference(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_set(swigCPtr, this, value);
	}

	public String getMaxOrderMessageReference() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderOfferField_MaxOrderMessageReference_get(swigCPtr, this);
	}

	public CThostFtdcTraderOfferField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTraderOfferField(), true);
	}

}
