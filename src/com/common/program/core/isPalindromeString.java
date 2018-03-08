package com.common.program.core;

public class isPalindromeString {

	public static void main(String[] args) {
		System.out.println(""+isPalindromeString("aba"));
	}	
	private static boolean isPalindromeString(String str) {
	    if (str == null)
	        return false;
	    int length = str.length();
	    System.out.println(length / 2);
	    for (int i = 0; i < length / 2; i++) {
	        if (str.charAt(i) != str.charAt(length - i - 1))
	            return false;
	    }
	    return true;
	}
}
