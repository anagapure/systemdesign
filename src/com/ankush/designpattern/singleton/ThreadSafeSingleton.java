package com.ankush.designpattern.singleton;

//To make the lazy initialization thread-safe, synchronization is used. However, 
//this can reduce performance due to the overhead of synchronization.
public class ThreadSafeSingleton {
	   private static ThreadSafeSingleton instance;
	   private ThreadSafeSingleton() { }
	   public static synchronized ThreadSafeSingleton getInstance() {
	       if (instance == null) {
	           instance = new ThreadSafeSingleton();
	       }
	       return instance;
	   }
	}