//code to print series of prime numbers
package com.john.basic;

import java.util.Scanner;

public class PrimeSeries {
	public static void main(String args[]) {

		int range;

		System.out.println("enter the range for prime series");
		Scanner input = new Scanner(System.in);

		range = input.nextInt();

		System.out.println("The prime Series are:");
		for (int number = 1; number < range; number++) {
			int value = 0;
			for (int count = 1; count < number; count++) {

				if ((number % count) == 0) {
					value++;
				}
			}

			if (value == 1 && number != 1) {
				System.out.print(number + " ");
			}
		}

		System.out.print("\n");
		input.close();
	}

}