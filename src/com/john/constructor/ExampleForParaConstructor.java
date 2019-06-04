// it is example for parameterized constructor
package com.john.constructor;

public class ExampleForParaConstructor {
	private int id;
	private String name;
	private int age;

	ExampleForParaConstructor(int i, String n) {
		id = i;
		name = n;
	}

	ExampleForParaConstructor(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ExampleForParaConstructor s1 = new ExampleForParaConstructor(111, "Karan");
		s1.display();
		s1 = new ExampleForParaConstructor(222, "Aryan", 25);
		s1.display();
	}
}
