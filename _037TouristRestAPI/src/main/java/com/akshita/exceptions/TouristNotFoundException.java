package com.akshita.exceptions;

public class TouristNotFoundException extends RuntimeException{
	
	String msg;
	public TouristNotFoundException(String msg){
		super(msg);
		this.msg = msg;
	}

}
