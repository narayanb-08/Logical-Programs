package com.nt.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List___RemoveDuplicateFromList {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(10);
	list.add(30);
	list.add(50);
	list.add(70);
	
	Set<Integer> set = new LinkedHashSet<>(list);
	
	List<Integer> uniquelist = new ArrayList<Integer>(set);
	System.out.println("After removing duplicates: "+set);
}
}
