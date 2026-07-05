package com.nt.array;

public class CopyArray {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int newarr[] = new int[arr.length];
	
	for(int i=0;i<newarr.length;i++) {
		newarr[i] = arr[i];
		System.out.print(newarr[i]+" ");
	}
}
}
