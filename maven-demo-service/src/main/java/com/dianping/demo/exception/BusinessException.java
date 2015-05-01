package com.dianping.demo.exception;

public class BusinessException extends Exception {

	public BusinessException(String errorCode, String errorMsg){
		
		super(errorCode+errorMsg);
	}
}
