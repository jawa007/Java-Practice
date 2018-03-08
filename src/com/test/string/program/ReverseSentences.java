package com.test.string.program;

public class ReverseSentences {

	public static void main(String[] args) {
		String str="position no.   1 @ Durga is This";
		String[] arr=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for (int i = arr.length-1; i >=0; i--) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
