package com.capgemini.lab5;

@SuppressWarnings("serial")
public class NameNotValidException extends Exception {
	
	private String message;
	
	public NameNotValidException()
	{
		
	}
	
	public NameNotValidException(String message)
	{
		super(message);
	}
	
	public String getMessage() {
		return this.message;
		
	}
}
