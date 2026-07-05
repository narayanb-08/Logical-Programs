package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumMinimumElement {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	
	Optional<Integer> max = list.stream()
				  .max((a,b) -> a.compareTo(b));
	
	Optional<Integer> min = list.stream()
								.min((a,b) -> a.compareTo(b));
	
	System.out.println(max);
	System.out.println(min);
}
}
