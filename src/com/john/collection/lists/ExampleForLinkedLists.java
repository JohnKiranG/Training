package com.john.collection.lists;

import java.util.LinkedList;
import java.util.Iterator;

public class ExampleForLinkedLists {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("ExampleForLinkedLists\n");
		// Creating Linkedlist
		LinkedList list = new LinkedList();
		// Adding object in Linkedlist
		list.add(12);
		list.add(12);
		list.add('j');
		list.add('j');
		list.add(12.5);
		list.add(12.5);
		list.add("john");
		list.add("john");
		list.addLast("kiran");
		list.addFirst("1");
		list.addFirst(2);
		
		// printing elements
		System.out.println("Printing Elements");
		System.out.println(list + "\n");
		
		// printing line by line
		System.out.println("Printing Elements using iterator");
		Iterator itr = list.descendingIterator();//descending iterator is used
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nfirst is "+list.getFirst());
		
		//list follows queue so pop means first out
		list.pop();
		System.out.println(list);
		
		//poll is similar to pop
		list.poll();
		System.out.println(list);
		
		list.push("push");
		System.out.println(list);
		
		
	}
}
