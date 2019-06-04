//it is used to remove white spaces between words
package com.john.stringoperations;

public class RemoveWhiteSpace {
	public static void main(String args[]) {
		String s = "Hello, how are you?";
		s = s.replaceAll(" ", "");
		System.out.println(s);
	}
}