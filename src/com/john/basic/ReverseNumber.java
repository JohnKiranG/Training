package com.john.basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		int number, remainder = 0, reverse = 0;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);

		number = input.nextInt();

		while (number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number /= 10;
		}

		System.out.println(reverse);
		input.close();
	}

}
