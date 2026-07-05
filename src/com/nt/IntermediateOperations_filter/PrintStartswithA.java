package com.nt.IntermediateOperations_filter;

import java.util.Arrays;
import java.util.List;

public class PrintStartswithA {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Narayan","Arjun","Shankar","Amar");
	
	list.stream()
		.filter(s -> s.startsWith("A"))
		.forEach(System.out::println);
}
}
