package com.nt.streamApiAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyIntegers {
public static void main(String[] args) {
	 String s[] = {"abc", "123", "456", "xyz"};

     List<Integer> result =
             Arrays.stream(s)
             	   .filter(str -> str.chars().allMatch(Character::isDigit))
                   .map(Integer::parseInt)
                   .collect(Collectors.toList());

     System.out.println(result);
}
}
