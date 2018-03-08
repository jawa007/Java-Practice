package com.common.program.core;

public class Fibonacci {
	static int max = 50;
	static int[] fib = new int[max];

	public static void main(String[] args) {
		for (int i = 0; i <max; i++) {
			System.out.print(fibonacci2(i) + " ");
		}
	}

	public static int fibonacci2(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1) {
			return 1;
		}
		if (fib[i] != 0)
		return fib[i];//Return cached result
		fib[i] = fibonacci2(i - 1) + fibonacci2(i - 2);//cached result
		return fib[i];
	}
}
