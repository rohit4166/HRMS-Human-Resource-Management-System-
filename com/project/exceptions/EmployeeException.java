package com.project.exceptions;

		// Employee Exception 

public class EmployeeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public EmployeeException() {
		
	}
	
	public EmployeeException(String message) {
		super(message);
	}
	
}
