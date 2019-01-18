/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcReqQueryTradeResultBySerialField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcReqQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqQueryTradeResultBySerialField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcReqQueryTradeResultBySerialField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
	}

	public void setReference(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
	}

	public int getReference() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
	}

	public void setRefrenceIssureType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this,
				value);
	}

	public char getRefrenceIssureType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr,
				this);
	}

	public void setRefrenceIssure(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
	}

	public String getRefrenceIssure() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_set(swigCPtr, this,
				value);
	}

	public String getIdentifiedCardNo() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_IdentifiedCardNo_get(swigCPtr,
				this);
	}

	public void setCustType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CustType_get(swigCPtr, this);
	}

	public void setBankAccount(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Password_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
	}

	public void setTradeAmount(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
	}

	public double getTradeAmount() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
	}

	public void setLongCustomerName(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_set(swigCPtr, this,
				value);
	}

	public String getLongCustomerName() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcReqQueryTradeResultBySerialField_LongCustomerName_get(swigCPtr,
				this);
	}

	public CThostFtdcReqQueryTradeResultBySerialField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcReqQueryTradeResultBySerialField(), true);
	}

}
