package com.test.array.program;

public class MinMaxElementArray {
	public static void main(String[] args) {
		int arr[] = { 140, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		int lowest = arr[0];
		int maximum=0;
		int secondLowest=0;
		int secondLargest=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < lowest) {
				secondLowest=lowest;
				lowest = arr[i];
			}else if(arr[i] < secondLowest){
				secondLowest=arr[i];
			}
			
			if (arr[i] > maximum) {
				secondLargest=maximum;
				maximum = arr[i];
			}else if(arr[i] > secondLargest){
				secondLargest=arr[i];
			}
		}
		System.out.println("maximum==>"+maximum+" secondLargest"+secondLargest);
		
		System.out.println(lowest+" secondLowest "+secondLowest);
	}
}
