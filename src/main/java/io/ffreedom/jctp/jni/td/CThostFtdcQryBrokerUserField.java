/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcQryBrokerUserField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQryBrokerUserField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQryBrokerUserField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryBrokerUserField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerUserField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerUserField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerUserField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQryBrokerUserField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcQryBrokerUserField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryBrokerUserField(), true);
	}

}
