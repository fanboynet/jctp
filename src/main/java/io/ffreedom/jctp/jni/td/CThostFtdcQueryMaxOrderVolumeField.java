/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcQueryMaxOrderVolumeField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcQueryMaxOrderVolumeField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcQueryMaxOrderVolumeField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQueryMaxOrderVolumeField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InvestorID_get(swigCPtr, this);
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InstrumentID_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_Direction_get(swigCPtr, this);
	}

	public void setOffsetFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_set(swigCPtr, this, value);
	}

	public char getOffsetFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_OffsetFlag_get(swigCPtr, this);
	}

	public void setHedgeFlag(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_set(swigCPtr, this, value);
	}

	public char getHedgeFlag() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_HedgeFlag_get(swigCPtr, this);
	}

	public void setMaxVolume(int value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_set(swigCPtr, this, value);
	}

	public int getMaxVolume() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_MaxVolume_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_ExchangeID_get(swigCPtr, this);
	}

	public void setInvestUnitID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InvestUnitID_set(swigCPtr, this, value);
	}

	public String getInvestUnitID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcQueryMaxOrderVolumeField_InvestUnitID_get(swigCPtr, this);
	}

	public CThostFtdcQueryMaxOrderVolumeField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQueryMaxOrderVolumeField(), true);
	}

}
