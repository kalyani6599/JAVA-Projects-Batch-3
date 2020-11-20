package com.capgemini.lab5;

@SuppressWarnings("serial")
public class AgevalidException extends Exception{
	private String message;
	
	public AgevalidException()
	{
		
	}
	
	public AgevalidException(String message)
	{
		super(message);
	}
	
	public String getMessage() {
		return this.message;
		
	}
	
}
