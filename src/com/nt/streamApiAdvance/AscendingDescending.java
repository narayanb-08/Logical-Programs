package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescending {
public static void main(String[] args) {
	Integer arr[] = {1,4,3,2,5};
	
	List<Integer> asc = Arrays.stream(arr)
						      .sorted()
						      .collect(Collectors.toList());
	
	List<Integer> desc = Arrays.stream(arr)
							   .sorted(Comparator.reverseOrder())
							   .collect(Collectors.toList());
	
	System.out.println(asc);
	System.out.println(desc); 
	
}
}
