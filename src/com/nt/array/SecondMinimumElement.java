package com.nt.array;

public class SecondMinimumElement {
public static void main(String[] args) {
	int arr[] = {12,32,13,45};
	
	int min = Integer.MAX_VALUE;
	int secondmin = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] < min) {
			secondmin=min; 
			min= arr[i]; //12
		}
		else if(arr[i]<secondmin && arr[i]!=min)
		{
			secondmin=arr[i];	
		}
	}
	System.out.println(secondmin);
}
}
