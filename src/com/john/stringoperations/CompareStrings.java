/*it is used to compare two strings ie each char
  in first string should be present in another ignore order*/
package com.john.stringoperations;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String args[]) {
		char temp;
		boolean a = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = input.nextLine();
		char c[] = s1.toCharArray();

		System.out.println("Enter string 2: ");
		String s2 = input.nextLine();
		char c1[] = s2.toCharArray();
		// arrange c in ascending order;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}

			}
		}
		// arrange c1 in ascending order
		for (int i = 0; i < s2.length(); i++) {
			for (int j = i + 1; j < s2.length(); j++) {
				if (c1[i] > c1[j]) {
					temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}

			}
		}
		// compare c and c1
		for (int i = 0; i < s1.length(); i++) {
			if (c[i] != c1[i]) {
				a = false;
			}
		}
		// checks for equal or not
		if (a == true) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		input.close();
	}
}
