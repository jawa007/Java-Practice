package com.core.java.datastructure;

import java.util.Hashtable;

public class PairsOfArraySum {

	private static final int MAX = 100000; // Max size of Hashmap

	static void printpairs(int arr[], int sum) {
		// Declares and initializes the whole array as false
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			binmap[arr[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		//printpairs(A, n);
		printUsingHashTable(A, n);
	}

	private static void printUsingHashTable(int[] a, int n) {
		Hashtable<Integer, Integer> hash=new Hashtable<>();
		for (int i=0 ; i<a.length - 1 ;i++)
		{
		  hash.put(a[i],i); // key is the element and value is its index.
		}
		 
		for (int i=0 ; i<a.length - 1; i++)
		{
			int key=n-a[i];
			if(hash.containsKey(key)){
				System.out.println(a[hash.get(key)]+","+a[i]);
			}
		}
	}
}

//References:https://stackoverflow.com/questions/1494130/find-all-pairs-of-integers-within-an-array-which-sum-to-a-specified-value