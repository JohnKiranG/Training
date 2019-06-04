package com.john.collection.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleForArrayLists {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println("ExampleForArrayLists\n");
		// Creating arraylist
		ArrayList first = new ArrayList();
		
		// Adding object in arraylist
		first.add(3);
		first.add(3);
		first.add('j');
		first.add('j');
		first.add(12.5);
		first.add(12.5);
		first.add("john");
		first.add("john");
		first.add(3, "kiran");
		
		// printing elements
		System.out.println("Printing Elements");
		System.out.println(first + "\n");
		
		// printing line by line
		System.out.println("Printing Elements using iterator");
		Iterator itr = first.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//prints size
		System.out.println("first size: "+first.size());
		
		//removes element at location
		System.out.println(first.remove(3));
		
		//removes first appearing element
		System.out.println(first.remove(12.5));
		
		System.out.println(first);
		
		System.out.println(first.removeAll(first));
		
		//clears all
		first.clear();
		System.out.println(first);
				
		//iteration using foreach loop
		System.out.println("\niteration using foreach");
		ArrayList<String> second = new ArrayList<String>();
		second.add("john");
		second.add("Vijay");
		second.add("Ravi");
		second.add("Ajay");
		for (String obj : second) {
			System.out.println(obj);
		}
		
		//add second to first
		first.add(second);
		System.out.println("\nadd second to first");
		System.out.println(first);
		
		//using add all added first to second
		second.addAll(first);
		System.out.println("\nUsing add all added first to second");
		System.out.println(second);
		
		//retain all
		second.retainAll(first);
		System.out.println("\nusing retain all for first on second");
		System.out.println(second);
		
		//retain all
		System.out.println("\nusing retain all for second on first");
		first.retainAll(second);
		System.out.println(first);
		
		System.out.println(first.contains(second));
		
		for (Object obj : second) {
			System.out.println(obj);
		}
		
		
	}
}

/*methods in java array lists
 *isEmpty-boolean
 *add 
 *addAll-boolean
 *remove
 *retainAll
 *size-int
 *contains(object)
 *containsAll(collection)
 *clear
 **/
