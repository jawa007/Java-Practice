package com.common.program.core;

/**
 * What is armstrong number? A armstrong number is a number such that the sum of
 * the cubes of its digits is equal to the number itself.
 * 
 * 
 * 13 + 53 + 33 = 1 + 125 + 27 = 153.
 * 
 * Armstrong number 1: 0 Armstrong number 2: 1 Armstrong number 3: 153 Armstrong
 * number 4: 370 Armstrong number 5: 371 Armstrong number 6: 407
 */

public class ArmstrongNumberExample {

	public static void main(String[] args) {
		int n = 153;
		int temp=n;
		int sum = 0;
		int rem = 0;
		while (n > 0) {
           rem=n%10;
           sum+=(rem*rem*rem);
           n=n/10;
		}
		System.out.println(sum==temp);
	}

}
