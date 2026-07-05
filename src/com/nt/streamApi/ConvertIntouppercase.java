package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;

public class ConvertIntouppercase {
public static void main(String[] args) {
	
	List<String> list = Arrays.asList("narayan","shankar","mahesh");
	
	list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
}
}
