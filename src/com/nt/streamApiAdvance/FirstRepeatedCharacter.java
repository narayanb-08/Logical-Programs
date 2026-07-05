package com.nt.streamApiAdvance;

import java.util.Arrays;

public class FirstRepeatedCharacter {
public static void main(String[] args) {
    String s1 = "Hello World";
    
    String result1 = Arrays.stream(s1.split(""))
    		.filter(ch -> s1.indexOf(ch) != s1.lastIndexOf(ch))
    		.findFirst()	        		
    		.get();
    
    System.out.println(result1);
    
//-------------------------------------------------------------------------
    
    String s2 = "HHello World";
    
    String result2 = Arrays.stream(s2.split(""))
    		.filter(ch -> s2.indexOf(ch) == s2.lastIndexOf(ch))
    		.findFirst()
    		.get();
    
    System.out.println(result2);
}
}
