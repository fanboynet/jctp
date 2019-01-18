/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcInvestorPositionField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInvestorPositionField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInvestorPositionField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcInvestorPositionField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InstrumentID_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InvestorID_get(swigCPtr, this);
	}

	public void setPosiDirection(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PosiDirection_set(swigCPtr, this, value);
	}

	public char getPosiDirection() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PosiDirection_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_HedgeFlag_get(swigCPtr, this);
	}

	public void setPositionDate(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionDate_set(swigCPtr, this, value);
	}

	public char getPositionDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionDate_get(swigCPtr, this);
	}

	public void setYdPosition(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_YdPosition_set(swigCPtr, this, value);
	}

	public int getYdPosition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_YdPosition_get(swigCPtr, this);
	}

	public void setPosition(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_Position_set(swigCPtr, this, value);
	}

	public int getPosition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_Position_get(swigCPtr, this);
	}

	public void setLongFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_LongFrozen_set(swigCPtr, this, value);
	}

	public int getLongFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_LongFrozen_get(swigCPtr, this);
	}

	public void setShortFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ShortFrozen_set(swigCPtr, this, value);
	}

	public int getShortFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ShortFrozen_get(swigCPtr, this);
	}

	public void setLongFrozenAmount(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_LongFrozenAmount_set(swigCPtr, this, value);
	}

	public double getLongFrozenAmount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_LongFrozenAmount_get(swigCPtr, this);
	}

	public void setShortFrozenAmount(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
	}

	public double getShortFrozenAmount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_get(swigCPtr, this);
	}

	public void setOpenVolume(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenVolume_set(swigCPtr, this, value);
	}

	public int getOpenVolume() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenVolume_get(swigCPtr, this);
	}

	public void setCloseVolume(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseVolume_set(swigCPtr, this, value);
	}

	public int getCloseVolume() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseVolume_get(swigCPtr, this);
	}

	public void setOpenAmount(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenAmount_set(swigCPtr, this, value);
	}

	public double getOpenAmount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenAmount_get(swigCPtr, this);
	}

	public void setCloseAmount(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseAmount_set(swigCPtr, this, value);
	}

	public double getCloseAmount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseAmount_get(swigCPtr, this);
	}

	public void setPositionCost(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionCost_set(swigCPtr, this, value);
	}

	public double getPositionCost() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionCost_get(swigCPtr, this);
	}

	public void setPreMargin(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PreMargin_set(swigCPtr, this, value);
	}

	public double getPreMargin() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PreMargin_get(swigCPtr, this);
	}

	public void setUseMargin(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_UseMargin_set(swigCPtr, this, value);
	}

	public double getUseMargin() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_UseMargin_get(swigCPtr, this);
	}

	public void setFrozenMargin(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenMargin_set(swigCPtr, this, value);
	}

	public double getFrozenMargin() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenMargin_get(swigCPtr, this);
	}

	public void setFrozenCash(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenCash_set(swigCPtr, this, value);
	}

	public double getFrozenCash() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenCash_get(swigCPtr, this);
	}

	public void setFrozenCommission(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenCommission_set(swigCPtr, this, value);
	}

	public double getFrozenCommission() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_FrozenCommission_get(swigCPtr, this);
	}

	public void setCashIn(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CashIn_set(swigCPtr, this, value);
	}

	public double getCashIn() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CashIn_get(swigCPtr, this);
	}

	public void setCommission(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_Commission_set(swigCPtr, this, value);
	}

	public double getCommission() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_Commission_get(swigCPtr, this);
	}

	public void setCloseProfit(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfit_set(swigCPtr, this, value);
	}

	public double getCloseProfit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfit_get(swigCPtr, this);
	}

	public void setPositionProfit(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionProfit_set(swigCPtr, this, value);
	}

	public double getPositionProfit() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PositionProfit_get(swigCPtr, this);
	}

	public void setPreSettlementPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PreSettlementPrice_set(swigCPtr, this, value);
	}

	public double getPreSettlementPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_PreSettlementPrice_get(swigCPtr, this);
	}

	public void setSettlementPrice(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_SettlementPrice_set(swigCPtr, this, value);
	}

	public double getSettlementPrice() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_SettlementPrice_get(swigCPtr, this);
	}

	public void setTradingDay(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_TradingDay_set(swigCPtr, this, value);
	}

	public String getTradingDay() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_TradingDay_get(swigCPtr, this);
	}

	public void setSettlementID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_SettlementID_set(swigCPtr, this, value);
	}

	public int getSettlementID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_SettlementID_get(swigCPtr, this);
	}

	public void setOpenCost(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenCost_set(swigCPtr, this, value);
	}

	public double getOpenCost() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_OpenCost_get(swigCPtr, this);
	}

	public void setExchangeMargin(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ExchangeMargin_set(swigCPtr, this, value);
	}

	public double getExchangeMargin() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ExchangeMargin_get(swigCPtr, this);
	}

	public void setCombPosition(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombPosition_set(swigCPtr, this, value);
	}

	public int getCombPosition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombPosition_get(swigCPtr, this);
	}

	public void setCombLongFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombLongFrozen_set(swigCPtr, this, value);
	}

	public int getCombLongFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombLongFrozen_get(swigCPtr, this);
	}

	public void setCombShortFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombShortFrozen_set(swigCPtr, this, value);
	}

	public int getCombShortFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CombShortFrozen_get(swigCPtr, this);
	}

	public void setCloseProfitByDate(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfitByDate_set(swigCPtr, this, value);
	}

	public double getCloseProfitByDate() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfitByDate_get(swigCPtr, this);
	}

	public void setCloseProfitByTrade(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
	}

	public double getCloseProfitByTrade() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_get(swigCPtr, this);
	}

	public void setTodayPosition(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_TodayPosition_set(swigCPtr, this, value);
	}

	public int getTodayPosition() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_TodayPosition_get(swigCPtr, this);
	}

	public void setMarginRateByMoney(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_MarginRateByMoney_set(swigCPtr, this, value);
	}

	public double getMarginRateByMoney() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_MarginRateByMoney_get(swigCPtr, this);
	}

	public void setMarginRateByVolume(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_MarginRateByVolume_set(swigCPtr, this, value);
	}

	public double getMarginRateByVolume() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_MarginRateByVolume_get(swigCPtr, this);
	}

	public void setStrikeFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_StrikeFrozen_set(swigCPtr, this, value);
	}

	public int getStrikeFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_StrikeFrozen_get(swigCPtr, this);
	}

	public void setStrikeFrozenAmount(double value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_set(swigCPtr, this, value);
	}

	public double getStrikeFrozenAmount() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_get(swigCPtr, this);
	}

	public void setAbandonFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_AbandonFrozen_set(swigCPtr, this, value);
	}

	public int getAbandonFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_AbandonFrozen_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_ExchangeID_get(swigCPtr, this);
	}

	public void setYdStrikeFrozen(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_set(swigCPtr, this, value);
	}

	public int getYdStrikeFrozen() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcInvestorPositionField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcInvestorPositionField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcInvestorPositionField(), true);
	}

}
