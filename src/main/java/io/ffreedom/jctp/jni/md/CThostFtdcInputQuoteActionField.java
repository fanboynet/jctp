/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcInputQuoteActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInputQuoteActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInputQuoteActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcInputQuoteActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InvestorID_get(swigCPtr, this);
	}

	public void setQuoteActionRef(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
	}

	public int getQuoteActionRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteActionRef_get(swigCPtr, this);
	}

	public void setQuoteRef(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteRef_set(swigCPtr, this, value);
	}

	public String getQuoteRef() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteRef_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_RequestID_get(swigCPtr, this);
	}

	public void setFrontID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_FrontID_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_SessionID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setQuoteSysID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
	}

	public String getQuoteSysID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_QuoteSysID_get(swigCPtr, this);
	}

	public void setActionFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ActionFlag_set(swigCPtr, this, value);
	}

	public char getActionFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ActionFlag_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_UserID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InstrumentID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_InvestUnitID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_ClientID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInputQuoteActionField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcInputQuoteActionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcInputQuoteActionField(), true);
	}

}
