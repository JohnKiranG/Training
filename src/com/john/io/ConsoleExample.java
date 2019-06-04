
package com.john.io;
import java.io.Console;

class ConsoleExample {
	public static void main(String args[]) {
		System.out.println("Enter your name: ");
		Console c = System.console();
		
		String n = c.readLine();
		System.out.println("Welcome " + n);
	}
}