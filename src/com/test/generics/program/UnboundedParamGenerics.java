package com.test.generics.program;

import java.util.ArrayList;
import java.util.List;

public class UnboundedParamGenerics {

	public static void main(String[] args) {
		
		List<Number> lst=new ArrayList<>();
		lst.add(10.00);
		lst.add(10);
		
		List<String> listString=new ArrayList<>();
		listString.add("Name");
		
		List rawList=new ArrayList<>();
		
		rawList=listString;
		//When we assign rawtype to generictype will get warning but reverse is fine.
		listString=rawList;
		
		List<Object> listObject=new ArrayList<>();
		listObject.add("Name");
		
		testWildCard(listObject);
		//Compilation Error
		//testObject(listString);
		
		List<Number> listNumber=new ArrayList<>();
		
		listNumber.add(Integer.valueOf(2));
		listNumber.add(Double.valueOf(2.0));
	}
	
	private static void testObject(List<Object> list) {
		
	}
	
    private static void testString(List<String> list) {
		
	}
    
    private static void testWildCard(List<?> list) {
		
	}
}
