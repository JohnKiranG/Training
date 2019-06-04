package com.john.stringoperations;

public class StringMethods {
	public static void main(String args[]) {
		equalsMethod();
		equalOperatorMethod();
		compareMethod();
		concatMethod();
		substringMethod();
		upperlowerMethod();
	}

	public static void equalsMethod() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}

	public static void equalOperatorMethod() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		// true (because both refer to same instance)
		System.out.println(s1 == s2);
		// false(because s3 refers to instance created in nonpool)
		System.out.println(s1 == s3);
	}

	public static void compareMethod() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}

	public static void concatMethod() {
		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);// Sachin Tendulkar
	}

	public static void substringMethod() {
		String s = "SachinTendulkar";
		System.out.println(s.substring(6));// Tendulkar
		System.out.println(s.substring(0, 6));// Sachin
	}

	public static void upperlowerMethod() {
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)
	}
}
