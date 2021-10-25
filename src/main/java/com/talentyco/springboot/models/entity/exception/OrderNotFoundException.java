package com.talentyco.springboot.models.entity.exception;

public class OrderNotFoundException extends Exception {

	public OrderNotFoundException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;
}
