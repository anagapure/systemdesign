package com.ankush.designpattern.singleton;

//This approach improves performance by reducing the overhead of synchronization using a double-check mechanism.
public class DoubleCheckedSingleton {
	   private static volatile DoubleCheckedSingleton instance;
	   private DoubleCheckedSingleton() { }
	   public static DoubleCheckedSingleton getInstance() {
	       if (instance == null) {
	           synchronized (DoubleCheckedSingleton.class) {
	               if (instance == null) {
	                   instance = new DoubleCheckedSingleton();
	               }
	           }
	       }
	       return instance;
	   }
	}