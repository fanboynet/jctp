/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcQryExchangeExecOrderActionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryExchangeExecOrderActionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryExchangeExecOrderActionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryExchangeExecOrderActionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setParticipantID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_ExchangeID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQryExchangeExecOrderActionField_TraderID_get(swigCPtr, this);
	}

	public CThostFtdcQryExchangeExecOrderActionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryExchangeExecOrderActionField(), true);
	}

}
