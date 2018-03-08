package com.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * There is a simple rule. The type of declaration must match the type of object you are creating.
 *
 */

public class GenericTest1 {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>(); // Valid. Same base type, same generic type
//		List<String> list1 = new ArrayList<String>(); // Valid. Polymorphic base type but same generic type
//		ArrayList<Object> list2 = new ArrayList<String>(); // Invalid. Same base type but different generic type.
//		List<Object> list3 = new ArrayList<String>(); // Invalid. Polymorphic base type different generic type
		List lst=new ArrayList();
		List<String> str=new ArrayList<>();
		
	}
}

class Animal{
	
}

class Cat extends Animal{
	
}

class Dog extends Animal{
	
}

