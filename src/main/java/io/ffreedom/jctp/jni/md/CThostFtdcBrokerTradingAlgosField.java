/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcBrokerTradingAlgosField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcBrokerTradingAlgosField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcBrokerTradingAlgosField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcBrokerTradingAlgosField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_BrokerID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_ExchangeID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_InstrumentID_get(swigCPtr, this);
	}

	public void setHandlePositionAlgoID(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_set(swigCPtr, this, value);
	}

	public char getHandlePositionAlgoID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_HandlePositionAlgoID_get(swigCPtr, this);
	}

	public void setFindMarginRateAlgoID(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_set(swigCPtr, this, value);
	}

	public char getFindMarginRateAlgoID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_FindMarginRateAlgoID_get(swigCPtr, this);
	}

	public void setHandleTradingAccountAlgoID(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_set(swigCPtr, this, value);
	}

	public char getHandleTradingAccountAlgoID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcBrokerTradingAlgosField_HandleTradingAccountAlgoID_get(swigCPtr, this);
	}

	public CThostFtdcBrokerTradingAlgosField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcBrokerTradingAlgosField(), true);
	}

}
