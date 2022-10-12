package com.example.springdemo.rest;

public class StudentNotFoundException extends RuntimeException{

	// Generate constructor from superclass
	
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
		
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}	
	
}
