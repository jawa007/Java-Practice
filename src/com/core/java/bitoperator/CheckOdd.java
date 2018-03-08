package com.core.java.bitoperator;

public class CheckOdd {

	public static boolean checkOdd(long number){
		return ((number & 0x1)==0);
	}
	public static void main(String[] args) {
		boolean flag=checkOdd(24);
		System.out.println(flag);
	}
}
