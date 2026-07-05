package com.nt.array;

import java.util.Arrays;

public class SecondLargestUsingSort {
public static void main(String[] args) {
	int arr[] = {10,20,30,50,57,98,47};
	int max = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i] > max) {
			max = arr[i];
		}
	}
	
	Arrays.sort(arr);
	
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[arr.length-1] > arr[i]) {
			System.out.println("Second largest element: "+arr[i]);
			break;
		}
	}
}
}
