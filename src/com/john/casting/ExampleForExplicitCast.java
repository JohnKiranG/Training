//Java program to illustrate explicit type conversion
package com.john.casting;

public class ExampleForExplicitCast {

	public static void main(String[] args) {
		double d = 100.04;

		// explicit type casting
		long l = (long) d;

		// explicit type casting
		int i = (int) l;
		System.out.println("Double value " + d);

		// fractional part lost
		System.out.println("Long value " + l);

		// fractional part lost
		System.out.println("Int value " + i);
	}
}
