/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcRspInfoField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcRspInfoField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcRspInfoField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcRspInfoField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setErrorID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcRspInfoField_ErrorID_set(swigCPtr, this, value);
	}

	public int getErrorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcRspInfoField_ErrorID_get(swigCPtr, this);
	}

	public void setErrorMsg(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcRspInfoField_ErrorMsg_set(swigCPtr, this, value);
	}

	public String getErrorMsg() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcRspInfoField_ErrorMsg_get(swigCPtr, this);
	}

	public CThostFtdcRspInfoField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcRspInfoField(), true);
	}

}
