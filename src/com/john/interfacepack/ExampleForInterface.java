//it is used in Interfacing printable, showable
package com.john.interfacepack;

public class ExampleForInterface implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		ExampleForInterface obj = new ExampleForInterface();
		obj.print();
		obj.show();
		System.out.println(number);
		System.out.println(number1);
	}
}
