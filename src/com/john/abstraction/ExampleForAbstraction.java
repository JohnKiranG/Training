//this is abstraction example for Bank
package com.john.abstraction;

public class ExampleForAbstraction {
	public static void main(String args[]) {
		Bank b;
		b = new Sbi();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
		b = new Canara();
		System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");

	}
}
