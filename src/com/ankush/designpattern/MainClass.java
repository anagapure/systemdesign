package com.ankush.designpattern;

public class MainClass {

	public static void main(String[] args) {
		SingletonExample se1 = SingletonExample.getInstance();
		SingletonExample se2 = SingletonExample.getLazyInstance();
		SingletonExample se3 = SingletonExample.getLazyThreadSafeInstance();
		
		//ENUM Singleton
		SingletonEnum.Instance.print("Obj1");
		SingletonEnum.Instance.print("Obj2");
	}

}
