/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcStrikeOffsetField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcStrikeOffsetField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcStrikeOffsetField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcStrikeOffsetField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setInstrumentID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InstrumentID_set(swigCPtr, this, value);
	}

	public String getInstrumentID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InstrumentID_get(swigCPtr, this);
	}

	public void setInvestorRange(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InvestorRange_set(swigCPtr, this, value);
	}

	public char getInvestorRange() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InvestorRange_get(swigCPtr, this);
	}

	public void setBrokerID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_BrokerID_set(swigCPtr, this, value);
	}

	public String getBrokerID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_BrokerID_get(swigCPtr, this);
	}

	public void setInvestorID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InvestorID_set(swigCPtr, this, value);
	}

	public String getInvestorID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_InvestorID_get(swigCPtr, this);
	}

	public void setOffset(double value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_Offset_set(swigCPtr, this, value);
	}

	public double getOffset() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_Offset_get(swigCPtr, this);
	}

	public void setOffsetType(char value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_OffsetType_set(swigCPtr, this, value);
	}

	public char getOffsetType() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcStrikeOffsetField_OffsetType_get(swigCPtr, this);
	}

	public CThostFtdcStrikeOffsetField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcStrikeOffsetField(), true);
	}

}
