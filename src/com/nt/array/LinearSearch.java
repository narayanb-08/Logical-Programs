package com.nt.array;

public class LinearSearch {
public static void main(String[] args) {
	int arr[] = {34,56,78,43,34};
	int key = 78;
	boolean ispresent = false;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == key) {
			ispresent = true;
			System.out.println("Given key is present at index: "+i);
			break;
		}	
	}	
  }
}