//how to access a method in a class using object
package com.john.objectandclass;

public class ExampleForObjectAndClass {
	public static void main(String args[]) {
		ExampleForObjectAndClass efo=new ExampleForObjectAndClass();
		efo.display();
	}
	void display() {
		System.out.println("this method is accessed through object");
	}
}
