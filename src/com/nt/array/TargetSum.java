package com.nt.array;

public class TargetSum {
public static void main(String[] args) {
	int arr[] = {1,2,3,42,6,7,3};
	int target = 10;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] + arr[j] == target) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}
}
