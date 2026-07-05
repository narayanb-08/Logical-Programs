package com.nt.streamApiAdvance;

import java.util.Arrays;

public class HighestLengthWord {
public static void main(String[] args) {
	String str = "I am learning Java";
	
	String result = Arrays.stream(str.split(" "))
						  .max((a,b) -> a.length()-b.length())
						  .get();
	
	System.out.println(result);
	

			            
}
}
