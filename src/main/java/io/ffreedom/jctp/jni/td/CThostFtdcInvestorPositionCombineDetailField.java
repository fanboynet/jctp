/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcInvestorPositionCombineDetailField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInvestorPositionCombineDetailField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInvestorPositionCombineDetailField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setTradingDay(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_get(swigCPtr, this);
	}

	public void setOpenDate(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_set(swigCPtr, this, value);
	}

	public String getOpenDate() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
	}

	public void setComTradeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_set(swigCPtr, this, value);
	}

	public String getComTradeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_get(swigCPtr, this);
	}

	public void setTradeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_set(swigCPtr, this, value);
	}

	public String getTradeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_Direction_get(swigCPtr, this);
	}

	public void setTotalAmt(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_set(swigCPtr, this, value);
	}

	public int getTotalAmt() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_get(swigCPtr, this);
	}

	public void setMargin(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_Margin_set(swigCPtr, this, value);
	}

	public double getMargin() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_Margin_get(swigCPtr, this);
	}

	public void setExchMargin(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_set(swigCPtr, this, value);
	}

	public double getExchMargin() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_get(swigCPtr, this);
	}

	public void setMarginRateByMoney(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_set(swigCPtr, this,
				value);
	}

	public double getMarginRateByMoney() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_get(swigCPtr,
				this);
	}

	public void setMarginRateByVolume(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_set(swigCPtr, this,
				value);
	}

	public double getMarginRateByVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_get(swigCPtr,
				this);
	}

	public void setLegID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_LegID_set(swigCPtr, this, value);
	}

	public int getLegID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_LegID_get(swigCPtr, this);
	}

	public void setLegMultiple(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_set(swigCPtr, this, value);
	}

	public int getLegMultiple() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_get(swigCPtr, this);
	}

	public void setCombInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this,
				value);
	}

	public String getCombInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr,
				this);
	}

	public void setTradeGroupID(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_set(swigCPtr, this, value);
	}

	public int getTradeGroupID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcInvestorPositionCombineDetailField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInvestorPositionCombineDetailField(), true);
	}

}
