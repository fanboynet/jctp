/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcTradingCodeField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcTradingCodeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTradingCodeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcTradingCodeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_InvestorID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BrokerID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ExchangeID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ClientID_get(swigCPtr, this);
	}

	public void setIsActive(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_IsActive_set(swigCPtr, this, value);
	}

	public int getIsActive() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_IsActive_get(swigCPtr, this);
	}

	public void setClientIDType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ClientIDType_set(swigCPtr, this, value);
	}

	public char getClientIDType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_ClientIDType_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BranchID_get(swigCPtr, this);
	}

	public void setBizType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BizType_set(swigCPtr, this, value);
	}

	public char getBizType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_BizType_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcTradingCodeField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcTradingCodeField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcTradingCodeField(), true);
	}

}
