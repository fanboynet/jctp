/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.ffreedom.jctp.jni.td;

public class CThostFtdcProductGroupField {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected CThostFtdcProductGroupField(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(CThostFtdcProductGroupField obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				jctptraderapiv6v3v11x64JNI.delete_CThostFtdcProductGroupField(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setProductID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ProductID_set(swigCPtr, this, value);
	}

	public String getProductID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ProductID_get(swigCPtr, this);
	}

	public void setExchangeID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ExchangeID_set(swigCPtr, this, value);
	}

	public String getExchangeID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ExchangeID_get(swigCPtr, this);
	}

	public void setProductGroupID(String value) {
		jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ProductGroupID_set(swigCPtr, this, value);
	}

	public String getProductGroupID() {
		return jctptraderapiv6v3v11x64JNI.CThostFtdcProductGroupField_ProductGroupID_get(swigCPtr, this);
	}

	public CThostFtdcProductGroupField() {
		this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcProductGroupField(), true);
	}

}
