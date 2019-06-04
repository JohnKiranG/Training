//it is example for method overloading
package com.john.polymorphism;

public class ExampleForMethodOverloading {
	static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	static double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static void main(String[] args) {
		System.out.println(add(11, 11));
		System.out.println(add(12.3, 12.6));
	}
}
