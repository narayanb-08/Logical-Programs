package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
public static void main(String[] args) {
	String str = "dabcadefg";
	
	String result = Arrays.stream(str.split(""))  //Splits string into characters.
						  .distinct()		// Removes duplicate characters while maintaining insertion order.
						  .collect(Collectors.joining()); // Joins all characters into a single string.
	
	System.out.println(result);

  
    
  }
}
