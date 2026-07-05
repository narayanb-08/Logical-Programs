package com.nt.IntermediateOperations_filter;

import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
	list.stream()
    .filter(n -> {
    	if(n <= 1) return false;

    	for(int i=2; i<=n/2; i++) {
    		if(n % i == 0)
    			return false;
    	}

    	return true;
    })
    .forEach(System.out::println);
}
}
