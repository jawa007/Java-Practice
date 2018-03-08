package com.core.java.datastructure;

import java.util.Arrays;

public class BinarySearch {
	static int arr[]={1,2,6,7,8,6,9};
	public static void main(String[] args) {
		int found=searchBinary(6,arr);
		System.out.println(arr[found]);
	}
	
	private static int searchBinary(int a,int[] arr) {
		Arrays.sort(arr);
		int lowest = 0;
	    int highest = arr.length-1;
		while(lowest <= highest){
			int middle=(lowest+highest)/2;
			if (a == arr[middle]) {
                return middle;
            }
			if(arr[middle] > a){
				highest=middle;
			}else{
				lowest=middle+1;
			}
		}
		return -1;
	}
}
