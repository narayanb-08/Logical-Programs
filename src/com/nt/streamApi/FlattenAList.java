package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;

public class FlattenAList {
public static void main(String[] args) {
	List<List<String>> list = Arrays.asList(
							Arrays.asList("Java","Python"),
							Arrays.asList("Oracle","Csharp")
			);
	
	list.stream()
		.flatMap(a -> a.stream())
		.forEach(System.out::println);
}
}
