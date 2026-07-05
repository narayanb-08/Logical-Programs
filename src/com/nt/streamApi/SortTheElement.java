package com.nt.streamApi;

import java.util.Arrays;
import java.util.List;

public class SortTheElement {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(4,2,74,3,7,1,6);
	
	list.stream().sorted().forEach(System.out::println);
}
}
