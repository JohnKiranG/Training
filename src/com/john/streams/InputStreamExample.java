package com.john.streams;

import java.io.IOException;

public class InputStreamExample {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the character:");
		int i=  System.in.read();
		System.out.println("The character is "+i);
	}
}
