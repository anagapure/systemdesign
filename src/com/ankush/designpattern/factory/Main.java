package com.ankush.designpattern.factory;

public class Main {

	public static void main(String[] args) {
		
		////////////////////Simple Factory pattern implementation////////////////////
		ICreditCard platinumCreditCard = new CreditCardFactory().getFactory("Platinum");
		System.out.println(platinumCreditCard.getCardType());
		System.out.println(platinumCreditCard.getCardMnthFee());
		System.out.println(platinumCreditCard.getCardLimit());
		
		ICreditCard coralCreditCard = new CreditCardFactory().getFactory("Coral");
		System.out.println(coralCreditCard.getCardType());
		System.out.println(coralCreditCard.getCardMnthFee());
		System.out.println(coralCreditCard.getCardLimit());
		
		System.out.println();
		//////////////////// Factory method pattern implementation////////////////////
		String cardType = "Coral";
		if(cardType=="Coral") {
			ICreditCard cc = new CoralFactory().cardFactory();
			System.out.println(cc.getCardType());
			System.out.println(cc.getCardMnthFee());
			System.out.println(cc.getCardLimit());
		}
		cardType = "Platinum";
		if(cardType=="Platinum") {
			ICreditCard cc = new PlatinumFactory().cardFactory();
			System.out.println(cc.getCardType());
			System.out.println(cc.getCardMnthFee());
			System.out.println(cc.getCardLimit());
		}
		
	}

}
