package com.core.java.datastructure;

public class MergeSort {

	static void sort(int input[]) {
		mergeSort(input, 0, input.length - 1);
	}

	private static void mergeSort(int[] input, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(input, low, mid);
			mergeSort(input, mid + 1, high);
			merge(input, low, mid, high);
		}
	}

	private static void merge(int[] input, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int left = low;
		int right = mid + 1;
		int k = 0;

		while (left <= mid && right <= high) {
			if (input[left] < input[right]) {
				temp[k] = input[left];
				left = left + 1;
			} else if (input[left] > input[right]) {
				temp[k] = input[right];
				right = right + 1;
			}
			k = k + 1;
		}

		if (left <= mid) {
			while (left <= mid) {
				temp[k] = input[left];
				left = left + 1;
				k = k + 1;
			}
		} else if (right <= high) {
			while (right <= high) {
				temp[k] = input[right];
				right = right + 1;
				k = k + 1;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			input[low + i] = temp[i];
		}
	}

	public static void main(String[] args) {
		System.out.println("Merge Sorting");
		int arr[] = { 0, 8, 3, 7, -1, 5 };
		System.out.println("Input Array==> ");
		printArray(arr);
		sort(arr);
		System.out.println("Sorted Array==> ");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
