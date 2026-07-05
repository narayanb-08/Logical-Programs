package com.nt.array;

public class DuplicateElement {
public static void main(String[] args) {
	int arr[] = {1,3,2,5,5,3,4,1};
	
	// Duplicate element find
	for(int i=0;i<arr.length;i++) {
		boolean isduplicate = false;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] == arr[j]) {
				isduplicate = true;
				break;
			}
		}
		if(isduplicate) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
