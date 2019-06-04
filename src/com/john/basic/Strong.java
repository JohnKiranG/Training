package com.john.basic;

import java.util.Scanner;

public class Strong {
	public static void main(String args[]) {
		int number, copy;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);

		number = input.nextInt();
		copy = number;
		int k = 1;
		int remainder = 0, sum = 0;
		while (number != 0) {
			remainder = number % 10;
			number /= 10;
		}

		number = copy;

		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			for (int i = remainder; i > 1; i--) {
				k *= i;
			}

			sum = sum + k;
			k = 1;

		}

		if (sum == copy)
			System.out.println("strong");
		else
			System.out.println("not strong");
		input.close();
	}

}
