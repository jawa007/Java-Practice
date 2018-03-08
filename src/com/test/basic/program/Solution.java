package com.test.basic.program;

public class Solution {

	public static void main(String[] args) {
		int j=0;
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};
		for(int i=0;i<a.length;i++){
			if(a[i] == 4){
				j=i;
				int c = b[--j];
				b[--j] = a[i];
				b[++j] = c;
			}
		}
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
