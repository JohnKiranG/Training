package com.john.collection.lists;

import java.util.Iterator;
import java.util.Stack;

public class ExampleForStack {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		System.out.println("Example for stack");
		// creating stack
		Stack stack = new Stack();
		
		// adding elements to stack
		stack.push(12);
		stack.push(12);
		stack.push('c');
		stack.push('c');
		stack.push(32.856);
		stack.push(32.856);
		stack.push("Ashish");
		stack.push("Ashish");
		
		//printing elements in stack
		System.out.println(stack);
		
		//popping
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.capacity());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.search(12));
		
		//print elements line by line
		System.out.println("\nprint elements using iterator");
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
