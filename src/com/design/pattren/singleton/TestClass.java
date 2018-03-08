package com.design.pattren.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestClass {
	public static void main(String[] args) throws Exception {
		Singleton s1 =Singleton.getInstance();
		Singleton s2 =Singleton.getInstance();
		
		print("s1",s1);
		print("s2",s2);
		
		//Reflection
		Class clazz=Class.forName("com.design.pattren.singleton.Singleton");
		Constructor<Singleton>constructor=clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s3=constructor.newInstance();
		print("s3",s3);
		
		//Serialization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/SDG/SDG-Internal/Practice/s2.ser"));
		oos.writeObject(s2);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/SDG/SDG-Internal/Practice/s2.ser"));
		Singleton s4=(Singleton) ois.readObject();
		print("s4",s4);
		
		//cloning
		Singleton s5=(Singleton) s2.clone();
		print("s5",s5);
	}

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s,Hashcode :%d", name,object.hashCode()));
	}
}
