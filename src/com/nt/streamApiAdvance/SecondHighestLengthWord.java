package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLengthWord {
public static void main(String[] args) {
	String str = "I am learning java";
	
	String result = Arrays.stream(str.split(" "))
						  .sorted(Comparator.comparingInt(String :: length)
						  .reversed())
						  .skip(1)
						  .findFirst()
						  .get();
	
	System.out.println(result);
		
// ------------------------------------------------------------------------------

	List <String> res = Arrays.stream(str.split(" "))
					   .sorted((a,b) -> b.length() - a.length())
					   .collect(Collectors.toList());
	
	System.out.println(res.get(1));
}
}
