package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondhighestLength {
public static void main(String[] args) {
	
	String str = "I am learning java";
	
	int result = Arrays.stream(str.split(" "))
					   .map(String::length)
					   .distinct()
					   .sorted(Comparator.reverseOrder())
					   .skip(1)
					   .findFirst()
					   .get();
	
	System.out.println(result);
					   
// ----------------------------------------------------------------------------
	
	List<Integer> res = Arrays.stream(str.split(" "))
							 .map(word -> word.length())
							 .distinct()
							 .sorted((a,b) -> b-a)
							 .collect(Collectors.toList());
	
	System.out.println(res.get(1));
			
}
}
