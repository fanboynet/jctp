/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcReqChangeAccountField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcReqChangeAccountField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcReqChangeAccountField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcReqChangeAccountField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradeCode(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeCode_set(swigCPtr, this, value);
	}

	public String getTradeCode() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeCode_get(swigCPtr, this);
	}

	public void setBankID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankID_set(swigCPtr, this, value);
	}

	public String getBankID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankID_get(swigCPtr, this);
	}

	public void setBankBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankBranchID_set(swigCPtr, this, value);
	}

	public String getBankBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankBranchID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerID_get(swigCPtr, this);
	}

	public void setBrokerBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerBranchID_set(swigCPtr, this, value);
	}

	public String getBrokerBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerBranchID_get(swigCPtr, this);
	}

	public void setTradeDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeDate_set(swigCPtr, this, value);
	}

	public String getTradeDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeDate_get(swigCPtr, this);
	}

	public void setTradeTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeTime_set(swigCPtr, this, value);
	}

	public String getTradeTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradeTime_get(swigCPtr, this);
	}

	public void setBankSerial(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankSerial_set(swigCPtr, this, value);
	}

	public String getBankSerial() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankSerial_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TradingDay_get(swigCPtr, this);
	}

	public void setPlateSerial(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_PlateSerial_set(swigCPtr, this, value);
	}

	public int getPlateSerial() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_PlateSerial_get(swigCPtr, this);
	}

	public void setLastFragment(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_LastFragment_set(swigCPtr, this, value);
	}

	public char getLastFragment() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_LastFragment_get(swigCPtr, this);
	}

	public void setSessionID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_SessionID_set(swigCPtr, this, value);
	}

	public int getSessionID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_SessionID_get(swigCPtr, this);
	}

	public void setCustomerName(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CustomerName_set(swigCPtr, this, value);
	}

	public String getCustomerName() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CustomerName_get(swigCPtr, this);
	}

	public void setIdCardType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_IdCardType_set(swigCPtr, this, value);
	}

	public char getIdCardType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_IdCardType_get(swigCPtr, this);
	}

	public void setIdentifiedCardNo(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
	}

	public String getIdentifiedCardNo() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_IdentifiedCardNo_get(swigCPtr, this);
	}

	public void setGender(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Gender_set(swigCPtr, this, value);
	}

	public char getGender() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Gender_get(swigCPtr, this);
	}

	public void setCountryCode(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CountryCode_set(swigCPtr, this, value);
	}

	public String getCountryCode() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CountryCode_get(swigCPtr, this);
	}

	public void setCustType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CustType_set(swigCPtr, this, value);
	}

	public char getCustType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CustType_get(swigCPtr, this);
	}

	public void setAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Address_set(swigCPtr, this, value);
	}

	public String getAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Address_get(swigCPtr, this);
	}

	public void setZipCode(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_ZipCode_set(swigCPtr, this, value);
	}

	public String getZipCode() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_ZipCode_get(swigCPtr, this);
	}

	public void setTelephone(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Telephone_set(swigCPtr, this, value);
	}

	public String getTelephone() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Telephone_get(swigCPtr, this);
	}

	public void setMobilePhone(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_MobilePhone_set(swigCPtr, this, value);
	}

	public String getMobilePhone() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_MobilePhone_get(swigCPtr, this);
	}

	public void setFax(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Fax_set(swigCPtr, this, value);
	}

	public String getFax() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Fax_get(swigCPtr, this);
	}

	public void setEMail(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_EMail_set(swigCPtr, this, value);
	}

	public String getEMail() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_EMail_get(swigCPtr, this);
	}

	public void setMoneyAccountStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_set(swigCPtr, this, value);
	}

	public char getMoneyAccountStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_MoneyAccountStatus_get(swigCPtr, this);
	}

	public void setBankAccount(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankAccount_set(swigCPtr, this, value);
	}

	public String getBankAccount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankAccount_get(swigCPtr, this);
	}

	public void setBankPassWord(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankPassWord_set(swigCPtr, this, value);
	}

	public String getBankPassWord() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankPassWord_get(swigCPtr, this);
	}

	public void setNewBankAccount(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_NewBankAccount_set(swigCPtr, this, value);
	}

	public String getNewBankAccount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_NewBankAccount_get(swigCPtr, this);
	}

	public void setNewBankPassWord(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_NewBankPassWord_set(swigCPtr, this, value);
	}

	public String getNewBankPassWord() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_NewBankPassWord_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_AccountID_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Password_get(swigCPtr, this);
	}

	public void setBankAccType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankAccType_set(swigCPtr, this, value);
	}

	public char getBankAccType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankAccType_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_InstallID_get(swigCPtr, this);
	}

	public void setVerifyCertNoFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
	}

	public char getVerifyCertNoFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_VerifyCertNoFlag_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_CurrencyID_get(swigCPtr, this);
	}

	public void setBrokerIDByBank(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_set(swigCPtr, this, value);
	}

	public String getBrokerIDByBank() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BrokerIDByBank_get(swigCPtr, this);
	}

	public void setBankPwdFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankPwdFlag_set(swigCPtr, this, value);
	}

	public char getBankPwdFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_BankPwdFlag_get(swigCPtr, this);
	}

	public void setSecuPwdFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_set(swigCPtr, this, value);
	}

	public char getSecuPwdFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_SecuPwdFlag_get(swigCPtr, this);
	}

	public void setTID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TID_set(swigCPtr, this, value);
	}

	public int getTID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_TID_get(swigCPtr, this);
	}

	public void setDigest(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Digest_set(swigCPtr, this, value);
	}

	public String getDigest() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_Digest_get(swigCPtr, this);
	}

	public void setLongCustomerName(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_LongCustomerName_set(swigCPtr, this, value);
	}

	public String getLongCustomerName() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcReqChangeAccountField_LongCustomerName_get(swigCPtr, this);
	}

	public CThostFtdcReqChangeAccountField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcReqChangeAccountField(), true);
	}

}
