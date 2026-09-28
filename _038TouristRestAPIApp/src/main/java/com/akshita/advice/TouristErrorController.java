package com.akshita.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.akshita.exceptions.TouristNotFoundException;

//GLOBAL EXCEPTION HANDLING

@RestControllerAdvice
public class TouristErrorController {
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetail> handleTouristNotFound(TouristNotFoundException te){
		//instead of ErrorDetails object, we could have simply used String but I want to give more info
		//to the user other than e.getMessage
		ErrorDetail ed = new ErrorDetail("NOT_FOUND", te.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(ed,HttpStatus.BAD_REQUEST);
	}
	
	//since we have only exception for tourist in this application we are handling only that here 
	//and always handle one generic exception, if in case some unforseen excpeiton occur, we don't want our application stop abruptly
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetail> handleException(Exception e){
		ErrorDetail ed = new ErrorDetail("SERVER_ERROR", e.getMessage(), LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(ed, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
