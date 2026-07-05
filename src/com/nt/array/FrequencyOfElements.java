package com.nt.array;

import java.util.Arrays;

public class FrequencyOfElements {
public static void main(String[] args) {
	int arr[] = {3,2,1,1,5,3,3,2};
	int count = 1;
	Arrays.sort(arr);
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == arr[i-1]) {
			count++;
		}
		else {
			System.out.println(arr[i-1]+" - "+count);
			count = 1;
		}
	}
	System.out.println(arr[arr.length-1]+" - "+count);
}
}
