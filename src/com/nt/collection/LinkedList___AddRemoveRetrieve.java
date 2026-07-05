package com.nt.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList___AddRemoveRetrieve {
public static void main(String[] args) {
	List<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	
	System.out.println(list);
	
	System.out.println();
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	
	System.out.println();
	list.removeFirst();
	list.removeLast();
	
	System.out.println();
	System.out.println(list);
}
}
