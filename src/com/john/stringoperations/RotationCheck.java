
//it checks whether the 2nd string is rotation of first
package com.john.stringoperations;

import java.util.Scanner;

public class RotationCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1 = input.nextLine();
		System.out.println("Enter string 2: ");
		String s2 = input.nextLine();
		String s3 = s1 + s1;
		if (s1.length() != s2.length()) {
			System.out.println("rotation is not possible");
		} else if (s3.contains(s2)) {
			System.out.println("TRUE");
		} else {
			System.out.println("False");
		}
		input.close();
	}
}
