package com.dianping.demo.exception;

public class POIException extends Exception {

	private String errorCode;
	
	private String errorMsg;

	public POIException(String errorCode, String errorMsg) {
		super(errorCode+"||"+errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "POIException [errorCode=" + errorCode + ", errorMsg="
				+ errorMsg + "]";
	}
	
	
}
