/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcFutureSignIOField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcFutureSignIOField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcFutureSignIOField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcFutureSignIOField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_SessionID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_InstallID_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_UserID_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_Digest_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_CurrencyID_get(swigCPtr, this);
	}

	public void setDeviceID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_DeviceID_set(swigCPtr, this, value);
	}

	public String getDeviceID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_DeviceID_get(swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerIDByBank_set(swigCPtr, this, value);
	}

	public String getBrokerIDByBank() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_BrokerIDByBank_get(swigCPtr, this);
	}

	public void setOperNo(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_OperNo_set(swigCPtr, this, value);
	}

	public String getOperNo() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_OperNo_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_RequestID_get(swigCPtr, this);
	}

	public void setTID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcFutureSignIOField_TID_get(swigCPtr, this);
	}

	public CThostFtdcFutureSignIOField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcFutureSignIOField(), true);
	}

}
