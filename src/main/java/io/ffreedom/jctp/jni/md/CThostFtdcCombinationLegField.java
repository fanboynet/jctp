/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.md;

public class CThostFtdcCombinationLegField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcCombinationLegField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcCombinationLegField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctpmdapiv6v3v11x64JNI.delete_CThostFtdcCombinationLegField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setCombInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_CombInstrumentID_set(swigCPtr, this, value);
	}

	public String getCombInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_CombInstrumentID_get(swigCPtr, this);
	}

	public void setLegID(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegID_set(swigCPtr, this, value);
	}

	public int getLegID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegID_get(swigCPtr, this);
	}

	public void setLegInstrumentID(String value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegInstrumentID_set(swigCPtr, this, value);
	}

	public String getLegInstrumentID() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegInstrumentID_get(swigCPtr, this);
	}

	public void setDirection(char value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_Direction_set(swigCPtr, this, value);
	}

	public char getDirection() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_Direction_get(swigCPtr, this);
	}

	public void setLegMultiple(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegMultiple_set(swigCPtr, this, value);
	}

	public int getLegMultiple() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_LegMultiple_get(swigCPtr, this);
	}

	public void setImplyLevel(int value) {
		jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_ImplyLevel_set(swigCPtr, this, value);
	}

	public int getImplyLevel() {
		return jctpmdapiv6v3v11x64JNI.CThostFtdcCombinationLegField_ImplyLevel_get(swigCPtr, this);
	}

	public CThostFtdcCombinationLegField() {
		this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcCombinationLegField(), true);
	}

}
