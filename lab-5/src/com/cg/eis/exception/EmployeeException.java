package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	private String message;
	
	public EmployeeException()
	{
		
	}
	
	public EmployeeException(String message)
	{
		super(message);
	}
	
	public String getMessage() {
		return this.message;
		
	}

}
