/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcQryTradeField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryTradeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryTradeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryTradeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InstrumentID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_ExchangeID_get(swigCPtr, this);
	}

	public void setTradeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeID_set(swigCPtr, this, value);
	}

	public String getTradeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeID_get(swigCPtr, this);
	}

	public void setTradeTimeStart(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeTimeStart_set(swigCPtr, this, value);
	}

	public String getTradeTimeStart() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeTimeStart_get(swigCPtr, this);
	}

	public void setTradeTimeEnd(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeTimeEnd_set(swigCPtr, this, value);
	}

	public String getTradeTimeEnd() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_TradeTimeEnd_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryTradeField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcQryTradeField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryTradeField(), true);
	}

}
