package com.training.exceptions;

public class RangeCheckExceptions extends Exception{
	
	private String message;

	public RangeCheckExceptions(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "custom Error message:= "+super.getMessage();
	}
	
	

}
