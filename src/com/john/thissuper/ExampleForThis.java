//this is used to refer current class instance variable
//this is used to call current class method
//this is used to call current constructor in parameterized constructor only
package com.john.thissuper;

public class ExampleForThis {
	int rollno;
	String name;
	float fee;

	public ExampleForThis() {
		System.out.println("super constructor is accessed");
	}

	public ExampleForThis(int rollno, String name, float fee) {
		//here current constructed is called
		this();
		
		// if this is removed initializing is not done
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
	//here is method to call
	void method1() {
		System.out.println("method1 is called through this");
	}

	void method2() {
		// m();
		// same as this.m()
		this.method1();
	}

	public static void main(String args[]) {
		ExampleForThis s1 = new ExampleForThis(111, "ankit", 5000f);
		ExampleForThis s2 = new ExampleForThis(112, "sumit", 6000f);
		s1.display();
		s2.display();
		s1.method2();
	}
}
