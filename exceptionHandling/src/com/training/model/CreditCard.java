package com.training.model;

import com.training.exceptions.RangeCheckExceptions;
import com.training.services.CreditCardService;

public class CreditCard {
	private String cardHolderName;
	private String cardNumber;
	private double creditLimit;
	
	
	public CreditCard(String cardHolderName, String cardNumber, double creditLimit) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		
		try {
			if(creditLimit<=0 || creditLimit>=10000) {
				throw new RangeCheckExceptions("Credit Limit is out of range");}
			else {
				this.creditLimit = creditLimit;}
		}
		catch(RangeCheckExceptions e) {
			e.printStackTrace();
		}
	}
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) throws RangeCheckExceptions{
		if(creditLimit<=0 || creditLimit>=10000) {
			throw new RangeCheckExceptions("Credit Limit is out of range");}
		else {
			this.creditLimit = creditLimit;}
	}
	
	
	
	
	@Override
	public String toString() {
		CreditCardService services = new CreditCardService(); 
		return this.cardHolderName+" "+services.findCardProvider(this.cardNumber);
	}
	
	

}
