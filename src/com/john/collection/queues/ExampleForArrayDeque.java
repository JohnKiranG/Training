package com.john.collection.queues;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleForArrayDeque {
	public static void main(String args[]) {
		// Creating ArrayDeque and adding elements
		Deque<Integer> deque = new ArrayDeque<Integer>();
		System.out.println(deque.add(5));
		System.out.println(deque.add(9));
		System.out.println(deque.add(7));
		System.out.println(deque.add(3));
		System.out.println(deque.add(3));

		// Traversing elements
		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("does deque contains 7: " + deque.contains(7));

		System.out.println("remove 7: " + deque.remove(7));

		System.out.println("is empty: " + deque.isEmpty());

		System.out.println("deque size: " + deque.size());

		String string = deque.toString();
		System.out.println(string);

		System.out.println(deque.getClass());

		Object array[] = deque.toArray();
		for (Object a : array) {
			System.out.println(a);
		}

		// offerFirst
		deque.offerFirst(0);
		System.out.println("After offerFirst Traversal...");
		for (Integer s : deque) {
			System.out.println(s);
		}
		// deque.poll();
		// deque.pollFirst();//it is same as poll()
		deque.pollLast();
		System.out.println("After pollLast() Traversal...");
		for (Integer s : deque) {
			System.out.println(s);
		}

		deque.pollFirst();
		System.out.println("After pollFirst() Traversal...");
		for (Integer s : deque) {
			System.out.println(s);
		}
		// offerLast
		deque.offerLast(0);
		System.out.println("After offerLast Traversal...");
		for (Integer s : deque) {
			System.out.println(s);
		}
		
		System.out.println(deque.hashCode());

	}

}
