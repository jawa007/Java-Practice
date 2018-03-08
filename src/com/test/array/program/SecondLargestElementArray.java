package com.test.array.program;

public class SecondLargestElementArray {
	public static void main(String[] args) {
		int arr[] = { 140, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int largest = 0;
		int secondLargest = 0;
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
		System.out.println("\nlargest number is:" + largest);
		System.out.println("\nSecond largest number is:" + secondLargest);
	}
}
