package com.common.program.core;

public class ReverseString {

	public static void main(String[] args) {
		String str="This is hello";
		String strRev="";
		for(int i=str.length()-1;i>=0;i--){
			  strRev+=str.charAt(i)+"";
			  //System.out.print(strRev);
		}
		System.out.println(""+strRev);
		
		 /*char[] try1= str.toCharArray();
         for (int i=try1.length-1;i>=0;i--)
         System.out.print(try1[i]);*/
	}
}
