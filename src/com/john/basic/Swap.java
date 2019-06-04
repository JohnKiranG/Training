//it is code swap two numbers without third variable
package com.john.basic;

import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		System.out.println("enter the numbers");
		Scanner input = new Scanner(System.in);

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("number1: " + number1 + "\nnumber2: " + number2);
		input.close();
	}

}
