package com.nt.array;

public class MoveZerosToFirst {
public static void main(String[] args) {
	int arr[]= {0,3,0,4,1};
	int j = arr.length-1;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]!=0) {
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
	}
	for (int i : arr) {
		System.out.print(i+" ");
	}
}
}
