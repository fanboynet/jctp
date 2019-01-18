/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcManualSyncBrokerUserOTPField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcManualSyncBrokerUserOTPField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcManualSyncBrokerUserOTPField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcManualSyncBrokerUserOTPField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_get(swigCPtr, this);
	}

	public void setOTPType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_set(swigCPtr, this, value);
	}

	public char getOTPType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_get(swigCPtr, this);
	}

	public void setFirstOTP(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_set(swigCPtr, this, value);
	}

	public String getFirstOTP() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_get(swigCPtr, this);
	}

	public void setSecondOTP(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_set(swigCPtr, this, value);
	}

	public String getSecondOTP() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_get(swigCPtr, this);
	}

	public CThostFtdcManualSyncBrokerUserOTPField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcManualSyncBrokerUserOTPField(), true);
	}

}
