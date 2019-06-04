package com.john.basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		int number, copy;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);

		number = input.nextInt();
		copy = number;

		int count = 0;
		double remainder = 0, sum = 0;
		while (number != 0) {
			remainder = number % 10;
			number /= 10;
			count++;
		}

		number = copy;

		while (number != 0) {
			remainder = number % 10;
			number /= 10;
			remainder = Math.pow(remainder, count);
			sum = sum + remainder;
		}

		if (sum == copy)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	input.close();
	}

}
