package com.nt.collection;

import java.util.ArrayList;
import java.util.List;

public class List___ReverseListWithout__Collections_sort {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	for(int i=list.size()-1; i>=0; i--) {
		System.out.println(list.get(i));
	}
}
}
