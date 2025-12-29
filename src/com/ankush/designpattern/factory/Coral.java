package com.ankush.designpattern.factory;

public class Coral implements ICreditCard{

	@Override
	public String getCardType() {
		return "Coral";
	}

	@Override
	public int getCardMnthFee() {
		return 399;
	}

	@Override
	public int getCardLimit() {
		return 10000;
	}

}
