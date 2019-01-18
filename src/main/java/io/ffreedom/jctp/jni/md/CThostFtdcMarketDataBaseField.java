/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcMarketDataBaseField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcMarketDataBaseField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr, this);
	}

	public void setPreSettlementPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr, this, value);
	}

	public double getPreSettlementPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(swigCPtr, this);
	}

	public void setPreClosePrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this, value);
	}

	public double getPreClosePrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr, this);
	}

	public void setPreOpenInterest(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr, this, value);
	}

	public double getPreOpenInterest() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(swigCPtr, this);
	}

	public void setPreDelta(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
	}

	public double getPreDelta() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
	}

	public CThostFtdcMarketDataBaseField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcMarketDataBaseField(), true);
	}

}
