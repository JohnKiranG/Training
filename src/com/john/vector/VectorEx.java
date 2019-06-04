package com.john.vector;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
			Integer a=10;
			Vector<Integer> vec=new Vector<Integer>();
			vec.add(1);
			vec.add(2);
			System.out.println(vec.add(3));
			System.out.println("actual elements: "+vec);
			
			vec.add(2,4);
			System.out.println("add 4 in 2 index: "+vec);
			
			System.out.println(vec.set(2,a));     
			System.out.println("set 6 in 2: "+vec);
			
			vec.setElementAt(7,1);     
			System.out.println("set element 6 at 2: "+vec);
			
			vec.insertElementAt(5,2);
			System.out.println("insert element 5 at 2:"+vec);
			
			System.out.println("capacity: " + vec.capacity());
			System.out.println("size: " + vec.size());
							



	}
}
