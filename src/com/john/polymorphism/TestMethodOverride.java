package com.john.polymorphism;

public class TestMethodOverride extends ExampleForMethodOverriding{
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		TestMethodOverride obj = new TestMethodOverride();// creating object
		obj.run();// calling method
	}
}
