package com.ankush.designpattern;

public class SingletonExample {
	
	private SingletonExample() {
		System.out.println("Private constructor");
	}

	//public static SingletonExample instance = null;
	public static SingletonExample instance = new SingletonExample();
	
	public static SingletonExample getInstance() {
		//return new SingletonExample();  // not valid, it will call every time during getInstance() call
		return instance;
	}
}
