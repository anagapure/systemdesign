package com.ankush.designpattern.singleton;

//To prevent multiple instances during deserialization, implement the readResolve() method.
//With readResolve(), whenever the object is deserialized, Java will return the existing Singleton.instance instead of creating a new one.
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

/*
 * Example of Breaking Singleton with Serialization
 * 
 * import java.io.*;
class Singleton implements Serializable {
   public static Singleton instance = new Singleton();
   private Singleton() {}
}
public class GFG {
   public static void main(String[] args) {
       try {
           Singleton instance1 = Singleton.instance;
           
           ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
           out.writeObject(instance1);  //	This serializes the singleton object and writes it to the file.
           out.close();
           
           ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
           Singleton instance2 = (Singleton) in.readObject();  //Reads the serialized object back into memory.
           in.close();
           
           System.out.println("instance1 hashCode: " + instance1.hashCode());
           System.out.println("instance2 hashCode: " + instance2.hashCode());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
 * 
 * 
 * You don’t explicitly call readResolve() yourself — it’s not like a normal method you invoke.
 * Key points
- When you deserialize an object with ObjectInputStream.readObject(), the Java serialization mechanism automatically checks if the class defines a readResolve() method.
- If present, the JVM calls readResolve() internally after deserialization, and the object returned by that method replaces the newly deserialized instance.
- This is how you enforce that deserialization returns your existing singleton instance instead of creating a new one.
 * 
 * */
 */