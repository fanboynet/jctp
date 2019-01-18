/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcExchangeOrderField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcExchangeOrderField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcExchangeOrderField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setOrderPriceType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderPriceType_set(swigCPtr, this, value);
	}

	public char getOrderPriceType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderPriceType_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_Direction_get(swigCPtr, this);
	}

	public void setCombOffsetFlag(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombOffsetFlag_set(swigCPtr, this, value);
	}

	public String getCombOffsetFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombOffsetFlag_get(swigCPtr, this);
	}

	public void setCombHedgeFlag(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombHedgeFlag_set(swigCPtr, this, value);
	}

	public String getCombHedgeFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombHedgeFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeTotalOriginal(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
	}

	public int getVolumeTotalOriginal() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_get(swigCPtr, this);
	}

	public void setTimeCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TimeCondition_set(swigCPtr, this, value);
	}

	public char getTimeCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TimeCondition_get(swigCPtr, this);
	}

	public void setGTDDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_GTDDate_set(swigCPtr, this, value);
	}

	public String getGTDDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_GTDDate_get(swigCPtr, this);
	}

	public void setVolumeCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeCondition_set(swigCPtr, this, value);
	}

	public char getVolumeCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeCondition_get(swigCPtr, this);
	}

	public void setMinVolume(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MinVolume_set(swigCPtr, this, value);
	}

	public int getMinVolume() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MinVolume_get(swigCPtr, this);
	}

	public void setContingentCondition(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ContingentCondition_set(swigCPtr, this, value);
	}

	public char getContingentCondition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ContingentCondition_get(swigCPtr, this);
	}

	public void setStopPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_StopPrice_set(swigCPtr, this, value);
	}

	public double getStopPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_StopPrice_get(swigCPtr, this);
	}

	public void setForceCloseReason(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ForceCloseReason_set(swigCPtr, this, value);
	}

	public char getForceCloseReason() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ForceCloseReason_get(swigCPtr, this);
	}

	public void setIsAutoSuspend(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IsAutoSuspend_set(swigCPtr, this, value);
	}

	public int getIsAutoSuspend() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IsAutoSuspend_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_RequestID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderLocalID_set(swigCPtr, this, value);
	}

	public String getOrderLocalID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InstallID_get(swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SettlementID_get(swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSysID_set(swigCPtr, this, value);
	}

	public String getOrderSysID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSysID_get(swigCPtr, this);
	}

	public void setOrderSource(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSource_set(swigCPtr, this, value);
	}

	public char getOrderSource() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSource_get(swigCPtr, this);
	}

	public void setOrderStatus(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderStatus_set(swigCPtr, this, value);
	}

	public char getOrderStatus() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderStatus_get(swigCPtr, this);
	}

	public void setOrderType(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderType_set(swigCPtr, this, value);
	}

	public char getOrderType() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderType_get(swigCPtr, this);
	}

	public void setVolumeTraded(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTraded_set(swigCPtr, this, value);
	}

	public int getVolumeTraded() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTraded_get(swigCPtr, this);
	}

	public void setVolumeTotal(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotal_set(swigCPtr, this, value);
	}

	public int getVolumeTotal() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotal_get(swigCPtr, this);
	}

	public void setInsertDate(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertDate_set(swigCPtr, this, value);
	}

	public String getInsertDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertDate_get(swigCPtr, this);
	}

	public void setInsertTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertTime_set(swigCPtr, this, value);
	}

	public String getInsertTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertTime_get(swigCPtr, this);
	}

	public void setActiveTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTime_set(swigCPtr, this, value);
	}

	public String getActiveTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTime_get(swigCPtr, this);
	}

	public void setSuspendTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SuspendTime_set(swigCPtr, this, value);
	}

	public String getSuspendTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SuspendTime_get(swigCPtr, this);
	}

	public void setUpdateTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_UpdateTime_set(swigCPtr, this, value);
	}

	public String getUpdateTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_UpdateTime_get(swigCPtr, this);
	}

	public void setCancelTime(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CancelTime_set(swigCPtr, this, value);
	}

	public String getCancelTime() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CancelTime_get(swigCPtr, this);
	}

	public void setActiveTraderID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTraderID_set(swigCPtr, this, value);
	}

	public String getActiveTraderID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTraderID_get(swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClearingPartID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SequenceNo_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BranchID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExchangeOrderField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeOrderField(), true);
	}

}
