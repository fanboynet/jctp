/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcUserRightsAssignField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcUserRightsAssignField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcUserRightsAssignField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcUserRightsAssignField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_UserID_get(swigCPtr, this);
	}

	public void setDRIdentityID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_DRIdentityID_set(swigCPtr, this, value);
	}

	public int getDRIdentityID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcUserRightsAssignField_DRIdentityID_get(swigCPtr, this);
	}

	public CThostFtdcUserRightsAssignField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcUserRightsAssignField(), true);
	}

}
