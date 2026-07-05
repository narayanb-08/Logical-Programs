package com.nt.array;

public class SecondlargestElement {
public static void main(String[] args) {
	int arr[] = {4,8,6,9,4};
	
	int max = Integer.MIN_VALUE;
	 System.out.println(max);
	int second = Integer.MIN_VALUE;
	
	for(int i=0;i<arr.length;i++) {
		
			if(arr[i] > max) {
				second = max;   //
				max = arr[i];	
			}
			else if(arr[i] > second && arr[i] != max){
				second = arr[i];
			}
	}
	
		System.out.println("Second Largest Element: "+second);		
	}

}
