package com.john.stringoperations;

public class StringExample {
	public static void main(String args[]) {
		// creating string by java string literal
		String s1 = "java";
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		// converting char array to string
		String s2 = new String(ch);
		// creating java string by new keyword
		String s3 = new String("example");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
