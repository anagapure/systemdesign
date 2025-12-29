package com.ankush.designpattern.factory;

public abstract class CreditCardFactoryMethod {
	protected abstract ICreditCard CreateCreditCardFactoryMethod();
	
	public ICreditCard cardFactory() {
		return CreateCreditCardFactoryMethod();
	} 

}
