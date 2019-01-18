/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcExchangeExecOrderField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExchangeExecOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeExecOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeExecOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setVolume(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_Volume_set(swigCPtr, this, value);
	}

	public int getVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_Volume_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_RequestID_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setOffsetFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OffsetFlag_set(swigCPtr, this, value);
	}

	public char getOffsetFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OffsetFlag_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_HedgeFlag_get(swigCPtr, this);
	}

	public void setActionType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ActionType_set(swigCPtr, this, value);
	}

	public char getActionType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ActionType_get(swigCPtr, this);
	}

	public void setPosiDirection(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_PosiDirection_set(swigCPtr, this, value);
	}

	public char getPosiDirection() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_PosiDirection_get(swigCPtr, this);
	}

	public void setReservePositionFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
	}

	public char getReservePositionFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_get(swigCPtr, this);
	}

	public void setCloseFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CloseFlag_set(swigCPtr, this, value);
	}

	public char getCloseFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CloseFlag_get(swigCPtr, this);
	}

	public void setExecOrderLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
	}

	public String getExecOrderLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InstallID_get(swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SettlementID_get(swigCPtr, this);
	}

	public void setExecOrderSysID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
	}

	public String getExecOrderSysID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_get(swigCPtr, this);
	}

	public void setInsertDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertDate_set(swigCPtr, this, value);
	}

	public String getInsertDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertDate_get(swigCPtr, this);
	}

	public void setInsertTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertTime_set(swigCPtr, this, value);
	}

	public String getInsertTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertTime_get(swigCPtr, this);
	}

	public void setCancelTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CancelTime_set(swigCPtr, this, value);
	}

	public String getCancelTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CancelTime_get(swigCPtr, this);
	}

	public void setExecResult(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecResult_set(swigCPtr, this, value);
	}

	public char getExecResult() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecResult_get(swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClearingPartID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SequenceNo_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BranchID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExchangeExecOrderField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeExecOrderField(), true);
	}

}
