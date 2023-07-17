package com.dailyCodeBuffer.employee.Error;

public class EmployeeNotFoundException extends Exception{

	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String message) {
		super(message);

	}
	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
	}
	

}
