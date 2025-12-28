package com.ankush.designpattern;

public class SingletonExample {
	
	private SingletonExample() {
		System.out.print("Private constructor");
	}

	public static SingletonExample instance = null;
	
	public static SingletonExample getInstance() {
		return new SingletonExample();
	}
}
