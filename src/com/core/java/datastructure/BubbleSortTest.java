package com.core.java.datastructure;

public class BubbleSortTest {

	public static void main(String[] args) {

		int arr[] = { 8, 7, 5, 6, 9 };
		System.out.println("Before Sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sortBubble(arr);
		System.out.println("After Sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void sortBubble(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
