package com.sdg.core.java.string;

public class RemoveConsecutiveDuplicate {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String str = "AAABBCCDDDEFGH";
		for (int i = 0; i < str.length(); i++) {
			sb=sb.append(str.charAt(i));
			for (int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)){
					i=j;
				}else{
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}
}
