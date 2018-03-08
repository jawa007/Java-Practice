package com.core.java.datastructure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));

		int low = 0;
		int high = x.length - 1;

		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}

	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			// pick the pivot
			int pos = partition(a, low, high);
			quickSort(a, low, pos - 1);
			quickSort(a, pos + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int left = low;
		int right = high;

		while (left < right) {
			while (a[left] <= pivot && left <= high) {
				left++;
			}

			while (a[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = a[low];
				a[low] = a[right];
				a[right] = temp;
			}
		}

		a[low] = a[right];
		a[right] = pivot;

		return right;
	}
}
