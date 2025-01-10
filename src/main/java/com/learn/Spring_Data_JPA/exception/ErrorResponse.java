package com.learn.Spring_Data_JPA.exception;

import java.util.Date;

public class ErrorResponse {

	private String errorMessage;
	
	private Date date;
	
	@Override
	public String toString() {
		return "ErrorResponse [errorMessage=" + errorMessage + ", date=" + date + ", success=" + success
				+ ", httpStatusCode=" + httpStatusCode + "]";
	}

	private boolean success;
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public ErrorResponse() {
		super();
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	private String httpStatusCode;
}
