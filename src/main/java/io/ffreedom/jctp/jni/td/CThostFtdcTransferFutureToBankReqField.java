/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcTransferFutureToBankReqField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcTransferFutureToBankReqField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcTransferFutureToBankReqField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTransferFutureToBankReqField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setFutureAccount(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FutureAccount_set(swigCPtr, this, value);
	}

	public String getFutureAccount() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FutureAccount_get(swigCPtr, this);
	}

	public void setFuturePwdFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
	}

	public char getFuturePwdFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FuturePwdFlag_get(swigCPtr, this);
	}

	public void setFutureAccPwd(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FutureAccPwd_set(swigCPtr, this, value);
	}

	public String getFutureAccPwd() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_FutureAccPwd_get(swigCPtr, this);
	}

	public void setTradeAmt(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_TradeAmt_set(swigCPtr, this, value);
	}

	public double getTradeAmt() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_TradeAmt_get(swigCPtr, this);
	}

	public void setCustFee(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_CustFee_set(swigCPtr, this, value);
	}

	public double getCustFee() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_CustFee_get(swigCPtr, this);
	}

	public void setCurrencyCode(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_CurrencyCode_set(swigCPtr, this, value);
	}

	public String getCurrencyCode() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcTransferFutureToBankReqField_CurrencyCode_get(swigCPtr, this);
	}

	public CThostFtdcTransferFutureToBankReqField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTransferFutureToBankReqField(), true);
	}

}
