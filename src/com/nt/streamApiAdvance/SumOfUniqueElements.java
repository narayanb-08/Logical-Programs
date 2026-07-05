package com.nt.streamApiAdvance;

import java.util.Arrays;

public class SumOfUniqueElements {
public static void main(String[] args) {
	
	int arr[] = {1,2,4,3,3,2,8,5,1};
	
	int sum = Arrays.stream(arr)
					.distinct()
					.sum();
	
	System.out.println(sum);
}
}
