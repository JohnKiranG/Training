package com.john.basic;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]) {
		int number, remainder = 0, reverse = 0, copy;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);

		number = input.nextInt();
		copy = number;

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}

		if (copy == reverse)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
	input.close();
	}

}
