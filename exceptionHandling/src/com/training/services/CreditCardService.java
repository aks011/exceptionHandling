package com.training.services;

import com.training.exceptions.InvalidNumber;
import com.training.interfaces.*;
import com.training.model.CreditCard;

public class CreditCardService implements CreditCardRepository{
	
	private CreditCard[] cards;
	private int counter=0;
	
	public String findCardProvider(String cardNumber) {
		
		if(cardNumber.charAt(0)=='3') {
			return "Amex";
		}
		else if(cardNumber.charAt(0)=='4') {
			return "Visa";
		}
		else if(cardNumber.charAt(0)=='5') {
			return "Master";
		}
		else
		{
			throw new InvalidNumber("Invalid Card number");
		}
	}
	
	

	public CreditCardService() {
		super();
		cards = new CreditCard[5];
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(CreditCard entity) throws NullPointerException {
		
		if(entity==null) {
			throw new NullPointerException("Values should not be null.");
		}
		else {
			cards[this.counter] = entity;
			this.counter++;
			return true;
		}
	}

	@Override
	public CreditCard[] findAll() throws Exception {
		
		return cards;
	}
	
	

}
