package com.ankush.designpattern.singleton;

//This method uses a static inner class to achieve lazy initialization without synchronization. It is efficient and thread-safe.
public class BillPughSingleton {
	   private BillPughSingleton() { }
	   private static class SingletonHelper {
	       private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	   }
	   public static BillPughSingleton getInstance() {
	       return SingletonHelper.INSTANCE;
	   }
	}