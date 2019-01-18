/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcOrderActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InvestorID_get(swigCPtr, this);
	}

	public void setOrderActionRef(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderActionRef_set(swigCPtr, this, value);
	}

	public int getOrderActionRef() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderActionRef_get(swigCPtr, this);
	}

	public void setOrderRef(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderRef_set(swigCPtr, this, value);
	}

	public String getOrderRef() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderRef_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderSysID_set(swigCPtr, this, value);
	}

	public String getOrderSysID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeChange(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_VolumeChange_set(swigCPtr, this, value);
	}

	public int getVolumeChange() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_VolumeChange_get(swigCPtr, this);
	}

	public void setActionDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionDate_set(swigCPtr, this, value);
	}

	public String getActionDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionDate_get(swigCPtr, this);
	}

	public void setActionTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionTime_set(swigCPtr, this, value);
	}

	public String getActionTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionTime_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InstallID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderLocalID_set(swigCPtr, this, value);
	}

	public String getOrderLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderLocalID_get(swigCPtr, this);
	}

	public void setActionLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionLocalID_set(swigCPtr, this, value);
	}

	public String getActionLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ActionLocalID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOrderActionStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
	}

	public char getOrderActionStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_OrderActionStatus_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_UserID_get(swigCPtr, this);
	}

	public void setStatusMsg(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_StatusMsg_set(swigCPtr, this, value);
	}

	public String getStatusMsg() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_StatusMsg_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InstrumentID_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_BranchID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_InvestUnitID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcOrderActionField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcOrderActionField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcOrderActionField(), true);
	}

}
