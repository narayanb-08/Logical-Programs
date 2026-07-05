package com.nt.array;

import java.util.Arrays;

public class Merging_Sorting {
	public static void main(String[] args) {
		int arr1[] = {2,5,7};
		int arr2[] = {4,1,6,3};
		int arr3[] = new int[arr1.length + arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		
		System.out.println("Merging two Array");
		for(int n : arr3) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("Array After Sorting in Ascending Order: ");
		for(int i=0;i<arr3.length-1;i++) {
			for(int j=0;j<arr3.length-1;j++) {
				if(arr3[j] > arr3[j+1]) {
					int temp = arr3[j];
					arr3[j] = arr3[j+1];
					arr3[j+1] = temp;
				}
			}
		}
		//Arrays.sort(arr3);
		for (int i : arr3) {
			System.out.print(i+" ");
		}
	}
}
