/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcInputExecOrderField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInputExecOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInputExecOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInputExecOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InstrumentID_get(swigCPtr, this);
	}

	public void setExecOrderRef(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ExecOrderRef_set(swigCPtr, this, value);
	}

	public String getExecOrderRef() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ExecOrderRef_get(swigCPtr, this);
	}

	public void setUserID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_UserID_set(swigCPtr, this, value);
	}

	public String getUserID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_UserID_get(swigCPtr, this);
	}

	public void setVolume(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_Volume_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_RequestID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOffsetFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_OffsetFlag_set(swigCPtr, this, value);
	}

	public char getOffsetFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_OffsetFlag_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_HedgeFlag_get(swigCPtr, this);
	}

	public void setActionType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ActionType_set(swigCPtr, this, value);
	}

	public char getActionType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ActionType_get(swigCPtr, this);
	}

	public void setPosiDirection(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_PosiDirection_set(swigCPtr, this, value);
	}

	public char getPosiDirection() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_PosiDirection_get(swigCPtr, this);
	}

	public void setReservePositionFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
	}

	public char getReservePositionFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ReservePositionFlag_get(swigCPtr, this);
	}

	public void setCloseFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_CloseFlag_set(swigCPtr, this, value);
	}

	public char getCloseFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_CloseFlag_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_InvestUnitID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_CurrencyID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_ClientID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInputExecOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcInputExecOrderField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInputExecOrderField(), true);
	}

}
