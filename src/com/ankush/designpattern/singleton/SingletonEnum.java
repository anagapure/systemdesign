package com.ankush.designpattern.singleton;

//Thread-safe, serialization-safe, reflection-safe.
//But Cannot extend other classes.
public enum SingletonEnum {
	
	Instance;
	
	public void print(String mesg) {
		System.out.println("Print from Singleton Enum "+mesg);
	}

}

//Other ways to create single ton without private constructor
/*
 * 1. ENUM
 * 2. Static Final Instance (Eager Initialization)
 * 
 * static final AppConfig INSTANCE = new AppConfig(); 
 * AppConfig.INSTANCE.showMessage();
 * 
 * 3. Static Block Initialization
 * 
 * static {
        INSTANCE = new AppConfig();
    }
 * 
 * 
 * */
