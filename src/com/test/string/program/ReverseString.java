package com.test.string.program;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class ReverseString {

	public static void main(String[] args) {
		String str="aaabbc";
		char [] ch=str.toCharArray();
//		for (int i=ch.length-1;i >= 0;i--) {
//			System.out.print(ch[i]);
//		}
		System.out.println("For loop");
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("For loop");
			int count=0;
			if(hashMap.containsKey(ch[i])){
				hashMap.put(ch[i], hashMap.get(ch)+1);
			}else{
				hashMap.put(ch[i],count);
			}
		}
		Set<Entry<Character, Integer>> entries=hashMap.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(""+entry.getKey()+"==>"+entry.getValue());
		}
	}
}
