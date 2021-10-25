package com.talentyco.springboot.models.entity.exception;

public class CategoryNotFoundException extends Exception {

	public CategoryNotFoundException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 1L;

}
