/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcTradingAccountReserveField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcTradingAccountReserveField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTradingAccountReserveField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTradingAccountReserveField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_BrokerID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_AccountID_get(swigCPtr, this);
	}

	public void setReserve(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_Reserve_set(swigCPtr, this, value);
	}

	public double getReserve() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_Reserve_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTradingAccountReserveField_CurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcTradingAccountReserveField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTradingAccountReserveField(), true);
	}

}
