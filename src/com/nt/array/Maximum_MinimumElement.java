package com.nt.array;

public class Maximum_MinimumElement {
	public static void main(String[] args) {
		int arr[] = {2,4,6,9,7,1};
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum elements: "+max);
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum element is: "+min);
	}
}
