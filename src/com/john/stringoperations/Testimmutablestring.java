package com.john.stringoperations;

public class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		// concat() method appends the string at the end
		s.concat(" Tendulkar");
		// will print Sachin because strings are immutable objects
		System.out.println(s);

	}
}