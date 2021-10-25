package com.talentyco.springboot.models.entity.exception;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 1L;
}
