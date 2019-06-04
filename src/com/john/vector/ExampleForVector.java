package com.john.vector;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleForVector {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] arr = new Integer[6];
		Vector<Integer> vec = new Vector<>();

		sizeVector(vec);					//.size()

		capacityVector(vec);				//.capacity()

		addVector(input, vec);				//.add()

		printVector(vec);

		vec.addElement(562);				//.addElement()

		printVector(vec);
		
        System.out.println("Cloned vector: "+vec.clone());  					//.clone()			

		System.out.println("contains:" + vec.contains(4));						//.contains()

		copyToArray(vec, arr);													//.copyInto()
		
		System.out.println("\nElement at index 3 is = " + vec.elementAt(3));	//.elementAt()
		
        System.out.println("Index of element is at: " +vec.indexOf(5, 2));      //.indexOf(element,start index)       

		elementsUse(vec);														//.elements()

		vec.ensureCapacity(25);													//.ensureCapacity()

		capacityVector(vec);								
		
		vec.insertElementAt(700, 2);											//.insertElementAt()
		
		printVector(vec);
		
        System.out.println("Is the Vector empty? = " +vec.isEmpty());  			//.isEmpty()
        
        iteration(vec); 														//Iteration	
		
		System.out.println("First element is = "+vec.firstElement());      		//.firstElement()
		
		vec.forEach(y -> System.out.println(y));  								//.forEach()
//or    vec.forEach(System.out::println);  	
		
		vec.clear();															//.clear()

		printVector(vec);
		

		input.close();
	}

	private static void iteration(Vector<Integer> vec) {
		 Iterator<Integer> itr = vec.iterator();  
	        while(itr.hasNext()){  
	             System.out.println(itr.next());  
	        }  
	}
	private static void copyToArray(Vector<Integer> vec, Integer arr[]) {
		// copy elements of vector into an array
		vec.copyInto(arr);

		for (Integer num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void elementsUse(Vector<Integer> vec) {
		Enumeration<Integer> enumobject = vec.elements();
		System.out.println("Data in enumeration object is: ");
		while (enumobject.hasMoreElements()) {
			System.out.println("Element: " + enumobject.nextElement());
		}
	}

	private static void printVector(Vector<Integer> vec) {
		System.out.println(vec);
	}

	private static void capacityVector(Vector<Integer> vec) {
		System.out.println("capacity: " + vec.capacity());
	}

	private static void sizeVector(Vector<Integer> vec) {
		System.out.println("size: " + vec.size());
	}

	private static void addVector(Scanner input, Vector<Integer> vec) {
		System.out.println("Enter elements to add");
		for (int count = 0; count < 5; count++) {
			vec.add(input.nextInt());
		}
	}

}
