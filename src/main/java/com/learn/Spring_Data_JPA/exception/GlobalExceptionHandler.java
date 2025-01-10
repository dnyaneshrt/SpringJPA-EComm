package com.learn.Spring_Data_JPA.exception;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<ErrorResponse> handleException(RuntimeException myOwnException)
	{
		System.out.println("inside Global handler"+myOwnException.getMessage());
		
		ErrorResponse  errorResponse=new ErrorResponse();
		errorResponse.setErrorMessage("errorWrittenByUs Global: "+myOwnException.getMessage());
		errorResponse.setDate(Date.valueOf(LocalDate.now()));
		errorResponse.setHttpStatusCode(""+HttpStatus.INTERNAL_SERVER_ERROR);
		errorResponse.setSuccess(false);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(errorResponse);
	}
	
}
