
//it is used to count the repeated char in string
package com.john.stringoperations;

import java.util.Scanner;

public class RepeatedCount {
	public static void main(String args[]) {

		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = input.nextLine();
		char c[] = s1.toCharArray();

		count = getCount(count, s1, c);
		System.out.println(count);
		input.close();
	}

	private static int getCount(int count, String s1, char[] c) {
		char temp;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}

			}
		}
		// System.out.println(c);

		for (int i = 0; i < s1.length() - 1; i++) {
			if (c[i] == c[i + 1]) {
				count++;
			}
		}
		return count;
	
	}
}
