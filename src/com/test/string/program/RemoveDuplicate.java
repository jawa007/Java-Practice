package com.test.string.program;

import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		
		HashMap<Character,String> a=new HashMap<>();
		
		char[] ch=str.toCharArray();
		
		for (char c : ch) {
            if(!a.containsKey(c)){
            	a.put(c, "");
			}
		}
		for (char c : a.keySet()) {
			System.out.print(c);
		}
	}
}
