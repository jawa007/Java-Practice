package com.core.java.abstrct;

public class Poly extends My{
	
	 public static void main(String a[]) {
	        My m = new My() {};//Anonymous class
		    //My m = new My() //comiplation error
	        m.myMethod();
	    }
}
