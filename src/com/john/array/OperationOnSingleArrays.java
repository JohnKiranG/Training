package com.john.array;

import java.util.Scanner;

public class OperationOnSingleArrays {
	public static void main(String[] args) {
		System.out.println("Enter size of your array1:");
		Scanner input = new Scanner(System.in);
		int arrayOne[] = new int[input.nextInt()];
		System.out.println("Enter size of your array2:");
		int arrayTwo[] = new int[input.nextInt()];

		insertArrayOne(input, arrayOne);

		insertArrayTwo(input, arrayTwo);

		addArrays(arrayOne, arrayTwo);

		multiplyArrays(arrayOne, arrayTwo);

		input.close();
	}

	private static void insertArrayOne(Scanner input, int[] arrayOne) {
		System.out.println("Enter elements of array1:");
		for (int count = 0; count < arrayOne.length; count++) {
			arrayOne[count] = input.nextInt();
		}
	}

	private static void insertArrayTwo(Scanner input, int[] arrayTwo) {
		System.out.println("Enter elements of array2:");
		for (int count = 0; count < arrayTwo.length; count++) {
			arrayTwo[count] = input.nextInt();
		}
	}

	private static void addArrays(int[] arrayOne, int[] arrayTwo) {
		System.out.println("Elements after addition:");
		for (int count = 0; count < arrayOne.length; count++) {
			System.out.print((arrayOne[count] + arrayTwo[count]) + " ");
		}
	}

	private static void multiplyArrays(int[] arrayOne, int[] arrayTwo) {
		System.out.println("\nElements after multiplication:");
		for (int count = 0; count < arrayOne.length; count++) {
			System.out.print((arrayOne[count] * arrayTwo[count]) + " ");
		}
	}
}
