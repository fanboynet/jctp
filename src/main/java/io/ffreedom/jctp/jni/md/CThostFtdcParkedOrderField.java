/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcParkedOrderField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcParkedOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcParkedOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcParkedOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InstrumentID_get(swigCPtr, this);
	}

	public void setOrderRef(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_OrderRef_set(swigCPtr, this, value);
	}

	public String getOrderRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_OrderRef_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserID_get(swigCPtr, this);
	}

	public void setOrderPriceType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_OrderPriceType_set(swigCPtr, this, value);
	}

	public char getOrderPriceType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_OrderPriceType_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_Direction_get(swigCPtr, this);
	}

	public void setCombOffsetFlag(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CombOffsetFlag_set(swigCPtr, this, value);
	}

	public String getCombOffsetFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CombOffsetFlag_get(swigCPtr, this);
	}

	public void setCombHedgeFlag(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CombHedgeFlag_set(swigCPtr, this, value);
	}

	public String getCombHedgeFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CombHedgeFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeTotalOriginal(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
	}

	public int getVolumeTotalOriginal() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_VolumeTotalOriginal_get(swigCPtr, this);
	}

	public void setTimeCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_TimeCondition_set(swigCPtr, this, value);
	}

	public char getTimeCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_TimeCondition_get(swigCPtr, this);
	}

	public void setGTDDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_GTDDate_set(swigCPtr, this, value);
	}

	public String getGTDDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_GTDDate_get(swigCPtr, this);
	}

	public void setVolumeCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_VolumeCondition_set(swigCPtr, this, value);
	}

	public char getVolumeCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_VolumeCondition_get(swigCPtr, this);
	}

	public void setMinVolume(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_MinVolume_set(swigCPtr, this, value);
	}

	public int getMinVolume() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_MinVolume_get(swigCPtr, this);
	}

	public void setContingentCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ContingentCondition_set(swigCPtr, this, value);
	}

	public char getContingentCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ContingentCondition_get(swigCPtr, this);
	}

	public void setStopPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_StopPrice_set(swigCPtr, this, value);
	}

	public double getStopPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_StopPrice_get(swigCPtr, this);
	}

	public void setForceCloseReason(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ForceCloseReason_set(swigCPtr, this, value);
	}

	public char getForceCloseReason() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ForceCloseReason_get(swigCPtr, this);
	}

	public void setIsAutoSuspend(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IsAutoSuspend_set(swigCPtr, this, value);
	}

	public int getIsAutoSuspend() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IsAutoSuspend_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_RequestID_get(swigCPtr, this);
	}

	public void setUserForceClose(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserForceClose_set(swigCPtr, this, value);
	}

	public int getUserForceClose() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserForceClose_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setParkedOrderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ParkedOrderID_set(swigCPtr, this, value);
	}

	public String getParkedOrderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ParkedOrderID_get(swigCPtr, this);
	}

	public void setUserType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserType_set(swigCPtr, this, value);
	}

	public char getUserType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_UserType_get(swigCPtr, this);
	}

	public void setStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_Status_set(swigCPtr, this, value);
	}

	public char getStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_Status_get(swigCPtr, this);
	}

	public void setErrorID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ErrorMsg_get(swigCPtr, this);
	}

	public void setIsSwapOrder(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IsSwapOrder_set(swigCPtr, this, value);
	}

	public int getIsSwapOrder() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IsSwapOrder_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_CurrencyID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_ClientID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_InvestUnitID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcParkedOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcParkedOrderField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcParkedOrderField(), true);
	}

}
