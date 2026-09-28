package com.akshita.advice;

import java.time.LocalDateTime;

public class ErrorDetail {
	
	String statusCode;
	String msg;
	LocalDateTime dateTime;
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorDetail(String statusCode, String msg, LocalDateTime dateTime) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		this.dateTime = dateTime;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "ErrorDetail [statusCode=" + statusCode + ", msg=" + msg + ", dateTime=" + dateTime + "]";
	}
	
	
	

}
