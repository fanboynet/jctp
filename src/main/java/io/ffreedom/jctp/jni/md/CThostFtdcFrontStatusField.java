/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcFrontStatusField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcFrontStatusField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcFrontStatusField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcFrontStatusField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFrontID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_FrontID_set(swigCPtr, this, value);
	}

	public int getFrontID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_FrontID_get(swigCPtr, this);
	}

	public void setLastReportDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_LastReportDate_set(swigCPtr, this, value);
	}

	public String getLastReportDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_LastReportDate_get(swigCPtr, this);
	}

	public void setLastReportTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_LastReportTime_set(swigCPtr, this, value);
	}

	public String getLastReportTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_LastReportTime_get(swigCPtr, this);
	}

	public void setIsActive(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_IsActive_set(swigCPtr, this, value);
	}

	public int getIsActive() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFrontStatusField_IsActive_get(swigCPtr, this);
	}

	public CThostFtdcFrontStatusField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcFrontStatusField(), true);
	}

}
