/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcQrySuperUserField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQrySuperUserField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQrySuperUserField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQrySuperUserField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcQrySuperUserField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcQrySuperUserField_UserID_get(swigCPtr, this);
	}

	public CThostFtdcQrySuperUserField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQrySuperUserField(), true);
	}

}
