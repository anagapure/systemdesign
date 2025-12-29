package com.ankush.designpattern;

public class SingletonExample {
	
	private SingletonExample() {
		System.out.println("Private constructor");
	}

	///////////Early/Eager loading/////////////////////////////
	
	//public static SingletonExample instance = null;
	public static SingletonExample instance = new SingletonExample(); //early loading	
	public static SingletonExample getInstance() {
		//return new SingletonExample();  // not valid, it will call every time during getInstance() call
		return instance;
	}
	
	////////////Lazy/ on-demand loading////////////////////////
	public static SingletonExample lazyInstance = null;
	public static SingletonExample getLazyInstance() {
		if(lazyInstance == null) {
			lazyInstance = new SingletonExample();
		}
		return lazyInstance;
	}
	
	///////////////////Lazy-Thread safe loading////////////////
	private static volatile SingletonExample volatileInstance;
	private static Object object = new Object();
	public static SingletonExample getLazyThreadSafeInstance() {
		SingletonExample ste = volatileInstance;
		if(ste==null) {
			synchronized (object) {
				if(volatileInstance==null) {
					ste = volatileInstance = new SingletonExample();
				}
			}
			
		}
		return ste;
	}
}
