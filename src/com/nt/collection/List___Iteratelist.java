package com.nt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List___Iteratelist {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	System.out.println("Using simple for loop: ");
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println();
	System.out.println("Using iterator: ");
	Iterator<Integer> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println();
	System.out.println("Using for each loop: ");
	list.forEach(element -> System.out.println(element));
}
}
