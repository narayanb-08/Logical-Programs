package com.nt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List___AscendingDecending {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(70);
	list.add(10);
	list.add(50);
	list.add(20);
	list.add(90);
	
	System.out.println("Ascending Order: ");
	TreeSet<Integer> set = new TreeSet<Integer>(list);
	System.out.println(set);
	
	System.out.println("Descending Order: ");
	System.out.println(set.descendingSet());
}
}
