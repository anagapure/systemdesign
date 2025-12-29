package com.ankush.designpattern.factory;

public class Platinum implements ICreditCard{

	@Override
	public String getCardType() {
		return "Platinum";
	}

	@Override
	public int getCardMnthFee() {
		return 499;
	}

	@Override
	public int getCardLimit() {
		return 11000;
	}

}
