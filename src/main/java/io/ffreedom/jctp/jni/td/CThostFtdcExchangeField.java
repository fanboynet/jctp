/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcExchangeField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExchangeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeID_get(swigCPtr, this);
	}

	public void setExchangeName(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeName_set(swigCPtr, this, value);
	}

	public String getExchangeName() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeName_get(swigCPtr, this);
	}

	public void setExchangeProperty(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeProperty_set(swigCPtr, this, value);
	}

	public char getExchangeProperty() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeField_ExchangeProperty_get(swigCPtr, this);
	}

	public CThostFtdcExchangeField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeField(), true);
	}

}
