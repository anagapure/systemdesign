package com.ankush.designpattern;

public enum SingletonEnum {
	
	Instance;
	
	public void print(String mesg) {
		System.out.println("Print from Singleton Enum "+mesg);
	}

}
