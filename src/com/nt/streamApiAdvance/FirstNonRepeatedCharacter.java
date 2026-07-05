package com.nt.streamApiAdvance;

import java.util.Arrays;

public class FirstNonRepeatedCharacter {
public static void main(String[] args) {
	
	String s2 = "HHello World";
    
    String result2 = Arrays.stream(s2.split(""))
    		.filter(ch -> s2.indexOf(ch) == s2.lastIndexOf(ch))
    		.findFirst()
    		.get();
    
    System.out.println(result2);
}
}
