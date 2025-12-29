package com.ankush.designpattern.factory;

public class CreditCardFactory {
	
	public ICreditCard getFactory(String type) {
		ICreditCard creditCard = null;
		if(type == "Platinum") {
			creditCard = new Platinum();
		}
		if(type == "Coral") {
			creditCard = new Coral();
		}
		return creditCard;
	}

}
