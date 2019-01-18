/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcOptionSelfCloseField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcOptionSelfCloseField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcOptionSelfCloseField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InstrumentID_get(swigCPtr, this);
	}

	public void setOptionSelfCloseRef(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseRef_set(swigCPtr, this, value);
	}

	public String getOptionSelfCloseRef() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseRef_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_UserID_get(swigCPtr, this);
	}

	public void setVolume(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_Volume_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_RequestID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
	}

	public void setOptSelfCloseFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
	}

	public char getOptSelfCloseFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
	}

	public void setOptionSelfCloseLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
	}

	public String getOptionSelfCloseLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InstallID_get(swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SettlementID_get(swigCPtr, this);
	}

	public void setOptionSelfCloseSysID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
	}

	public String getOptionSelfCloseSysID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
	}

	public void setInsertDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
	}

	public String getInsertDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InsertDate_get(swigCPtr, this);
	}

	public void setInsertTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
	}

	public String getInsertTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InsertTime_get(swigCPtr, this);
	}

	public void setCancelTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
	}

	public String getCancelTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_CancelTime_get(swigCPtr, this);
	}

	public void setExecResult(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
	}

	public char getExecResult() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ExecResult_get(swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_SessionID_get(swigCPtr, this);
	}

	public void setUserProductInfo(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_UserProductInfo_set(swigCPtr, this, value);
	}

	public String getUserProductInfo() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_UserProductInfo_get(swigCPtr, this);
	}

	public void setStatusMsg(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_StatusMsg_get(swigCPtr, this);
	}

	public void setActiveUserID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ActiveUserID_set(swigCPtr, this, value);
	}

	public String getActiveUserID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_ActiveUserID_get(swigCPtr, this);
	}

	public void setBrokerOptionSelfCloseSeq(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BrokerOptionSelfCloseSeq_set(swigCPtr, this, value);
	}

	public int getBrokerOptionSelfCloseSeq() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BrokerOptionSelfCloseSeq_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_BranchID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_InvestUnitID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_CurrencyID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionSelfCloseField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcOptionSelfCloseField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcOptionSelfCloseField(), true);
	}

}
