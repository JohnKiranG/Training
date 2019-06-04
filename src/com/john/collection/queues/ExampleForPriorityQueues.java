package com.john.collection.queues;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExampleForPriorityQueues {
	public static void main(String args[]) {
		// Creating PriorityQueue and adding elements
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		System.out.println(queue.add(5));
		System.out.println(queue.add(9));
		System.out.println(queue.add(7));
		System.out.println(queue.add(3));
		System.out.println(queue.add(3));

		// Traversing elements
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("does queue contains 7: " + queue.contains(7));

		System.out.println("remove 7: " + queue.remove(7));

		System.out.println("is empty: " + queue.isEmpty());

		System.out.println("queue size: " + queue.size());

		String string = queue.toString();
		System.out.println(string);

		System.out.println(queue.getClass());

		Object array[] = queue.toArray();
		for (Object a : array) {
			System.out.println(a);
		}
	}
}
