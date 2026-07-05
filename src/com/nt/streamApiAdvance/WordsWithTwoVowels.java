package com.nt.streamApiAdvance;

import java.util.Arrays;

public class WordsWithTwoVowels {
public static void main(String[] args) {
	String str = "I am learning stream Api java";
	
//	Arrays.stream(str.split(" "))
//	      .filter(word -> word.replaceAll("[^aeiouAEIOU]", "").length() == 2)
//	      .forEach(System.out::println

	        Arrays.stream(str.split(" "))
	              .filter(word -> 
	                     word.chars()
	                         .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
	                         .count() == 2
	              )
	              .forEach(System.out::println);
	    }
	
}
