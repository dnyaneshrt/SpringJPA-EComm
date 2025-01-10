package com.learn.Spring_Data_JPA.exception;

public class MyOwnException extends RuntimeException{

	public MyOwnException(String response)
	{
		super(response);
	}
	
}
