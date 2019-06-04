package com.john.stringoperations;

public class StringBufferExample {
	public static void main(String args[]) {
		appendMethod();
		insertMethod();
		replaceMethod();
		reverseMethod();
	}

	public static void appendMethod() {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println("appended string: "+sb);// prints Hello Java
	}

	public static void insertMethod() {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");// now original string is changed
		System.out.println("inserted string: "+sb);// prints HJavaello
	}

	public static void replaceMethod() {
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "Java");
		System.out.println("replaces string: "+sb);// prints HJavalo
	}

	public static void reverseMethod() {
		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println("reverse string: "+sb);// prints olleH
	}
}
