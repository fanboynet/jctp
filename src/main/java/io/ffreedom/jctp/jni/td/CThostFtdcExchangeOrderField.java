/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

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
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcExchangeOrderField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setOrderPriceType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderPriceType_set(swigCPtr, this, value);
	}

	public char getOrderPriceType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderPriceType_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_Direction_get(swigCPtr, this);
	}

	public void setCombOffsetFlag(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombOffsetFlag_set(swigCPtr, this, value);
	}

	public String getCombOffsetFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombOffsetFlag_get(swigCPtr, this);
	}

	public void setCombHedgeFlag(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombHedgeFlag_set(swigCPtr, this, value);
	}

	public String getCombHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CombHedgeFlag_get(swigCPtr, this);
	}

	public void setLimitPrice(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_LimitPrice_set(swigCPtr, this, value);
	}

	public double getLimitPrice() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_LimitPrice_get(swigCPtr, this);
	}

	public void setVolumeTotalOriginal(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
	}

	public int getVolumeTotalOriginal() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_get(swigCPtr, this);
	}

	public void setTimeCondition(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TimeCondition_set(swigCPtr, this, value);
	}

	public char getTimeCondition() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TimeCondition_get(swigCPtr, this);
	}

	public void setGTDDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_GTDDate_set(swigCPtr, this, value);
	}

	public String getGTDDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_GTDDate_get(swigCPtr, this);
	}

	public void setVolumeCondition(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeCondition_set(swigCPtr, this, value);
	}

	public char getVolumeCondition() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeCondition_get(swigCPtr, this);
	}

	public void setMinVolume(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MinVolume_set(swigCPtr, this, value);
	}

	public int getMinVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MinVolume_get(swigCPtr, this);
	}

	public void setContingentCondition(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ContingentCondition_set(swigCPtr, this, value);
	}

	public char getContingentCondition() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ContingentCondition_get(swigCPtr, this);
	}

	public void setStopPrice(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_StopPrice_set(swigCPtr, this, value);
	}

	public double getStopPrice() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_StopPrice_get(swigCPtr, this);
	}

	public void setForceCloseReason(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ForceCloseReason_set(swigCPtr, this, value);
	}

	public char getForceCloseReason() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ForceCloseReason_get(swigCPtr, this);
	}

	public void setIsAutoSuspend(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IsAutoSuspend_set(swigCPtr, this, value);
	}

	public int getIsAutoSuspend() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IsAutoSuspend_get(swigCPtr, this);
	}

	public void setBusinessUnit(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BusinessUnit_set(swigCPtr, this, value);
	}

	public String getBusinessUnit() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BusinessUnit_get(swigCPtr, this);
	}

	public void setRequestID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_RequestID_set(swigCPtr, this, value);
	}

	public int getRequestID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_RequestID_get(swigCPtr, this);
	}

	public void setOrderLocalID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderLocalID_set(swigCPtr, this, value);
	}

	public String getOrderLocalID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderLocalID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeID_get(swigCPtr, this);
	}

	public void setParticipantID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
	}

	public String getParticipantID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ParticipantID_get(swigCPtr, this);
	}

	public void setClientID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClientID_set(swigCPtr, this, value);
	}

	public String getClientID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClientID_get(swigCPtr, this);
	}

	public void setExchangeInstID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
	}

	public String getExchangeInstID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
	}

	public void setTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TraderID_set(swigCPtr, this, value);
	}

	public String getTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TraderID_get(swigCPtr, this);
	}

	public void setInstallID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InstallID_set(swigCPtr, this, value);
	}

	public int getInstallID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InstallID_get(swigCPtr, this);
	}

	public void setOrderSubmitStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
	}

	public char getOrderSubmitStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_get(swigCPtr, this);
	}

	public void setNotifySequence(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_NotifySequence_set(swigCPtr, this, value);
	}

	public int getNotifySequence() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_NotifySequence_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SettlementID_get(swigCPtr, this);
	}

	public void setOrderSysID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSysID_set(swigCPtr, this, value);
	}

	public String getOrderSysID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSysID_get(swigCPtr, this);
	}

	public void setOrderSource(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSource_set(swigCPtr, this, value);
	}

	public char getOrderSource() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderSource_get(swigCPtr, this);
	}

	public void setOrderStatus(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderStatus_set(swigCPtr, this, value);
	}

	public char getOrderStatus() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderStatus_get(swigCPtr, this);
	}

	public void setOrderType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderType_set(swigCPtr, this, value);
	}

	public char getOrderType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_OrderType_get(swigCPtr, this);
	}

	public void setVolumeTraded(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTraded_set(swigCPtr, this, value);
	}

	public int getVolumeTraded() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTraded_get(swigCPtr, this);
	}

	public void setVolumeTotal(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotal_set(swigCPtr, this, value);
	}

	public int getVolumeTotal() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_VolumeTotal_get(swigCPtr, this);
	}

	public void setInsertDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertDate_set(swigCPtr, this, value);
	}

	public String getInsertDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertDate_get(swigCPtr, this);
	}

	public void setInsertTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertTime_set(swigCPtr, this, value);
	}

	public String getInsertTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_InsertTime_get(swigCPtr, this);
	}

	public void setActiveTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTime_set(swigCPtr, this, value);
	}

	public String getActiveTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTime_get(swigCPtr, this);
	}

	public void setSuspendTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SuspendTime_set(swigCPtr, this, value);
	}

	public String getSuspendTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SuspendTime_get(swigCPtr, this);
	}

	public void setUpdateTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_UpdateTime_set(swigCPtr, this, value);
	}

	public String getUpdateTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_UpdateTime_get(swigCPtr, this);
	}

	public void setCancelTime(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CancelTime_set(swigCPtr, this, value);
	}

	public String getCancelTime() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_CancelTime_get(swigCPtr, this);
	}

	public void setActiveTraderID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTraderID_set(swigCPtr, this, value);
	}

	public String getActiveTraderID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ActiveTraderID_get(swigCPtr, this);
	}

	public void setClearingPartID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClearingPartID_set(swigCPtr, this, value);
	}

	public String getClearingPartID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_ClearingPartID_get(swigCPtr, this);
	}

	public void setSequenceNo(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SequenceNo_set(swigCPtr, this, value);
	}

	public int getSequenceNo() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_SequenceNo_get(swigCPtr, this);
	}

	public void setBranchID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BranchID_set(swigCPtr, this, value);
	}

	public String getBranchID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_BranchID_get(swigCPtr, this);
	}

	public void setIPAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IPAddress_set(swigCPtr, this, value);
	}

	public String getIPAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_IPAddress_get(swigCPtr, this);
	}

	public void setMacAddress(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MacAddress_set(swigCPtr, this, value);
	}

	public String getMacAddress() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcExchangeOrderField_MacAddress_get(swigCPtr, this);
	}

	public CThostFtdcExchangeOrderField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcExchangeOrderField(), true);
	}

}
