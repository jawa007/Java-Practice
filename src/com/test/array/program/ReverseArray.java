package com.test.array.program;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = new int[3];
		int j = 0;
		for (int i = a.length-1; i>=0; i--) {
			b[j] = a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));
	}
}
