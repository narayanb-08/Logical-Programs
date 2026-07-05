package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
public static void main(String[] args) {
	String str = "Mississippi";
	
	Map<String, Long> result = Arrays.stream(str.split(""))
									 .collect(Collectors.groupingBy(Function.identity(),
											 					    Collectors.counting())
											 
											 );
	
	System.out.println(result);
}
}	
