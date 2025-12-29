package com.ankush.designpattern.singleton;

public enum SingletonEnum {
	
	Instance;
	
	public void print(String mesg) {
		System.out.println("Print from Singleton Enum "+mesg);
	}

}
