package com.john.stringoperations;

public class StringBuilderExample {

	public static void main(String[] args) {
		appendMethod();
		insertMethod();
		replaceMethod();
		reverseMethod();
	}

	public static void appendMethod() {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println("appended string: "+sb);// prints Hello Java
	}

	public static void insertMethod() {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.insert(1, "Java");// now original string is changed
		System.out.println("inserted string: "+sb);// prints HJavaello
	}

	public static void replaceMethod() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.replace(1, 3, "Java");
		System.out.println("replaces string: "+sb);// prints HJavalo
	}

	public static void reverseMethod() {
		StringBuilder sb = new StringBuilder("Hello");
		sb.reverse();
		System.out.println("reverse string: "+sb);// prints olleH
	}

}
