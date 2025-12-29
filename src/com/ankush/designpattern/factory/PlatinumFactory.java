package com.ankush.designpattern.factory;

public class PlatinumFactory extends CreditCardFactoryMethod{

	@Override
	protected ICreditCard CreateCreditCardFactoryMethod() {
		return new Platinum();
	}
}
