package com.training.interfaces;

import com.training.model.CreditCard;

public interface CreditCardRepository {
	
	public boolean add(CreditCard entity) throws NullPointerException;
	public CreditCard[] findAll() throws Exception;

}
