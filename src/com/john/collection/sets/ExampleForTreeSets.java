package com.john.collection.sets;

import java.util.TreeSet;
import java.util.Iterator;

public class ExampleForTreeSets {
	public static void main(String args[]) {
		// Creating TreeSet and adding elements
		TreeSet<Integer> set = new TreeSet<Integer>();
		System.out.println(set.add(5));
		System.out.println(set.add(9));
		System.out.println(set.add(7));
		System.out.println(set.add(3));
		System.out.println(set.add(3));

		// Traversing elements
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("does set contains 7: " + set.contains(7));

		System.out.println("remove 7: " + set.remove(7));

		System.out.println("is empty: " + set.isEmpty());

		System.out.println("set size: " + set.size());

		String string = set.toString();
		System.out.println(string);

		System.out.println(set.getClass());

		Object array[] = set.toArray();
		for (Object a : array) {
			System.out.println(a);
		}
	}
}
