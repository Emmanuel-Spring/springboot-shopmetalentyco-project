package com.talentyco.springboot.models.entity.exception;

public class ProductNotFoundException extends Exception {

	public ProductNotFoundException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 1L;

}
