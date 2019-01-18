/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcInstrumentCommissionRateField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcInstrumentCommissionRateField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInstrumentCommissionRateField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestorRange_set(swigCPtr, this, value);
	}

	public char getInvestorRange() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestorRange_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
	}

	public void setOpenRatioByMoney(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByMoney_set(swigCPtr, this, value);
	}

	public double getOpenRatioByMoney() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByMoney_get(swigCPtr, this);
	}

	public void setOpenRatioByVolume(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByVolume_set(swigCPtr, this, value);
	}

	public double getOpenRatioByVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByVolume_get(swigCPtr, this);
	}

	public void setCloseRatioByMoney(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByMoney_set(swigCPtr, this, value);
	}

	public double getCloseRatioByMoney() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByMoney_get(swigCPtr, this);
	}

	public void setCloseRatioByVolume(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByVolume_set(swigCPtr, this,
				value);
	}

	public double getCloseRatioByVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByVolume_get(swigCPtr,
				this);
	}

	public void setCloseTodayRatioByMoney(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByMoney_set(swigCPtr, this,
				value);
	}

	public double getCloseTodayRatioByMoney() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByMoney_get(swigCPtr,
				this);
	}

	public void setCloseTodayRatioByVolume(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByVolume_set(swigCPtr, this,
				value);
	}

	public double getCloseTodayRatioByVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByVolume_get(swigCPtr,
				this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_ExchangeID_get(swigCPtr, this);
	}

	public void setBizType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_BizType_set(swigCPtr, this, value);
	}

	public char getBizType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_BizType_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentCommissionRateField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcInstrumentCommissionRateField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInstrumentCommissionRateField(), true);
	}

}
