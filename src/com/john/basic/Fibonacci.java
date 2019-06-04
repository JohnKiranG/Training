package com.john.basic;

//it is used to print fibonacci series of given range
import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {

		int range;

		System.out.println("Enter the range for Fibonacci series");

		Scanner k = new Scanner(System.in);
		range = k.nextInt();

		int previous1 = 0, previous2 = 1, present;

		System.out.println("Fibonacci Series are:");

		System.out.print(previous1 + "," + previous2 + ",");

		for (int count = 1; count <= (range - 2); count++) {
			present = previous1 + previous2;
			previous1 = previous2;
			previous2 = present;
			if (count == (range - 2)) {
				System.out.print(present);
			} else
				System.out.print(present + ",");

		}
		System.out.println();
		k.close();
	}

}