package com.training.exceptions;

public class InvalidNumber extends RuntimeException{

	private String message;

	public InvalidNumber(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Custom Exception message:= "+super.getMessage();
	}
	
}
