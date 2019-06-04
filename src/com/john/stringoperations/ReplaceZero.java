//it replaces 010 with 00
package com.john.stringoperations;

public class ReplaceZero {
	public static void main(String[] args) {
		String s = "10101";
		s = s.replace("010", "00");
		System.out.println(s);
	}
}
