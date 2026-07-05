package com.nt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List___Maximum_MinimumFromList {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	System.out.println("Minimum Element:"+Collections.min(list));
	System.out.println("Maximum Element: "+Collections.max(list));
}
}
