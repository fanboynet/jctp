/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcInputOrderActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInputOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInputOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcInputOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InvestorID_get(swigCPtr, this);
	}

	public void setOrderActionRef(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderActionRef_set(swigCPtr, this, value);
	}

	public int getOrderActionRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderActionRef_get(swigCPtr, this);
	}

	public void setOrderRef(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderRef_set(swigCPtr, this, value);
	}

	public String getOrderRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderRef_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderSysID_set(swigCPtr, this, value);
	}

	public String getOrderSysID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_OrderSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeChange(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_VolumeChange_set(swigCPtr, this, value);
	}

	public int getVolumeChange() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_VolumeChange_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_UserID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InstrumentID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_InvestUnitID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputOrderActionField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcInputOrderActionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcInputOrderActionField(), true);
	}

}
