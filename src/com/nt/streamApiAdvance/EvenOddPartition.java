package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddPartition {

public static void main(String[] args) {
	Integer arr[] = {1,2,3,4,5,6,7,8,9};
	
	Map<Boolean, List<Integer>> result = Arrays.stream(arr)
											   .collect(Collectors.partitioningBy(n -> n%2==0));
	
	System.out.println(result);
}
}
