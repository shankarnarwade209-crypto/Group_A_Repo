package com.rudra;

import java.util.*;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(70);
		list.add(20);
		list.add(40);
		
		List<Integer> list2 = list.stream().sorted(Collections.reverseOrder()).toList();
		List<Integer> list3 = list.stream().sorted().toList();
		
		System.out.println("Unsorted List :"+list);
		System.out.println("Reverse Sorted List : "+ list2);
		System.out.println("Sorted List : "+ list3);

	}

}
