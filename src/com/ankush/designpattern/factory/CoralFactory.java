package com.ankush.designpattern.factory;

public class CoralFactory extends CreditCardFactoryMethod{

	@Override
	protected ICreditCard CreateCreditCardFactoryMethod() {
		return new Coral();
	}
}
