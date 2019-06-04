// super is used to access parent variable
// super is used to access parent method
// super is used to access parent constructor in this constructor only
package com.john.thissuper;

public class TestSuper extends ExampleForSuper {
	public TestSuper() {
		super();
		System.out.println("child constructor is accessed");
	}
	
	String color = "black";

	void eat() {
		System.out.println("child method is accessed");
	}

	void printColor() {
		System.out.println("Super class varible: " + super.color);
		System.out.println("child class variable: " + color);
	}

	void methodCall() {
		super.eat();
		eat();
	}

	public static void main(String args[]) {
		TestSuper ts = new TestSuper();
		ts.printColor();
		ts.methodCall();
		
	}

}
