package com.ankush.designpattern.singleton;

//To prevent multiple instances during deserialization, implement the readResolve() method.
public class SerializationSafeSingleton implements java.io.Serializable {
	   private static final long serialVersionUID = 1L;
	   private static final SerializationSafeSingleton instance = new SerializationSafeSingleton();
	   private SerializationSafeSingleton() { }
	   public static SerializationSafeSingleton getInstance() {
	       return instance;
	   }
	   protected Object readResolve() {
	       return getInstance();
	   }
	}