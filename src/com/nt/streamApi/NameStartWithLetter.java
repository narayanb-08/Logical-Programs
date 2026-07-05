package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;

public class NameStartWithLetter {
public static void main(String[] args) {
	List<String> list = Arrays.asList("Arjun","Narayan","Kedar","Amar");
	
	long count = list.stream()
				 .filter(name -> name.startsWith("A"))
				 .count();
	
	System.out.println(count);
}
}
