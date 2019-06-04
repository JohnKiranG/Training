package com.john.basic;
//code to check given is prime number or composite number

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]) {
		int number;
		System.out.println("enter the number to test prime or not");
		Scanner input = new Scanner(System.in);

		number = input.nextInt();

		int value = 0;

		for (int count = 1; count < (number / 2); count++) {

			if ((number % count) == 0) {
				value++;
			}
		}
		if (value == 1 && number != 1) {
			System.out.println("It is prime number");
		} else
			System.out.println("It is composite number");
	input.close();
	}

}