package com.test.array.program;

public class DuplicateinArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3, 4, 5, 8, 8 };
		// String[] a = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		// for (int i = 0; i < a.length; i++) {
		// for (int j=i+1; j < a.length; j++) {
		// if(a[i]==a[j] && (i != j)){
		// System.out.println("Duplicate=="+a[i]);
		// break;
		// }
		// }
		// }

		printRepeating(a, a.length);
	}

	static void printRepeating(int arr[], int size) {
		int count[] = new int[size];
		int i;
		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i]]++;
		}
	}

}
