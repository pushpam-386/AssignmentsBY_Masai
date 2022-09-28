package com.push.exception;

import java.time.LocalDateTime;

public class MyErrorException {
	private LocalDateTime localDateTime;
	private String message;
	private String detail;
	
	
	public MyErrorException(LocalDateTime localDateTime, String message, String detail) {
		super();
		this.localDateTime = localDateTime;
		this.message = message;
		this.detail = detail;
	}


	public MyErrorException() {
		super();
	}


	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	@Override
	public String toString() {
		return "MyErrorException [localDateTime=" + localDateTime + ", message=" + message + ", detail=" + detail + "]";
	}
	
	
	
}
