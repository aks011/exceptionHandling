package com.tester;

import com.training.model.CreditCard;
import com.training.services.CreditCardService;

public class UserInputApplication {
	
	public static void main(String[] args) {
		
		//CreditCard card1 = new CreditCard("aks","4535",345);
		//CreditCard card2 = new CreditCard("aks","1535",8899);//invalid no.
		CreditCard card3 = new CreditCard("aks","4535",38885);//range check;
		
		CreditCardService service = new CreditCardService();
		
		//service.add(card1);
		//service.add(card2);
		service.add(card3);
		
		CreditCard[] cards=null;
		try {
			cards = service.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CreditCard eachCard: cards) {
			if(eachCard!=null) {
				System.out.println(eachCard);
			}
			
		}
		
		
	}

}
