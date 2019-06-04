
//it is used to remove special characters except alphabets and numbers
package com.john.stringoperations;

import java.util.Scanner;

public class RemoveSpecialCharacter {
	public static void main(String args[]) {
		// first one
		String s = "Hello, how are you?";
		s = s.replaceAll("[,?]", "");
		System.out.println("Replaced: " + s + "\n");
		String words[] = s.split("\\s");
		System.out.println("Splitted: ");
		for (String w : words) {
			System.out.println(w);
		}
		// second one
		String k = "This is, a book!";
		k = k.replaceAll("[^a-zA-Z0-9\\s+]", "");
		System.out.println("\n" + "Replaced: " + k);
		String word[] = k.split("\\s");
		System.out.println("\n" + "Splitted: ");
		for (String w : word) {
			System.out.println(w);
		}
		// third one
		Scanner input = new Scanner(System.in);
		System.out.println("\n" + "Enter a string");
		String r = input.nextLine();
		r = r.replaceAll("[^a-zA-Z0-9\\s+]", "");
		System.out.println(r);
		String word1[] = r.split("\\s");
		for (String w : word1) {
			System.out.println(w);
		}
		input.close();
	}
}
