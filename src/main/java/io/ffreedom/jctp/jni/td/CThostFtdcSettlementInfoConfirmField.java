/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcSettlementInfoConfirmField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcSettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcSettlementInfoConfirmField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSettlementInfoConfirmField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
	}

	public void setConfirmDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_set(swigCPtr, this, value);
	}

	public String getConfirmDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_get(swigCPtr, this);
	}

	public void setConfirmTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_set(swigCPtr, this, value);
	}

	public String getConfirmTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_SettlementID_get(swigCPtr, this);
	}

	public void setAccountID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_AccountID_set(swigCPtr, this, value);
	}

	public String getAccountID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_AccountID_get(swigCPtr, this);
	}

	public void setCurrencyID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_set(swigCPtr, this, value);
	}

	public String getCurrencyID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_get(swigCPtr, this);
	}

	public CThostFtdcSettlementInfoConfirmField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSettlementInfoConfirmField(), true);
	}

}
