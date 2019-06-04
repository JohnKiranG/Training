package com.john.sorting;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {

		int array[] = { 5, 6, 3, 4, 2, 1 };

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		for (int j = 0; j <= 5; j++) {
			if (array[j] == number) {
				System.out.println("the number is found: " + array[j]);
				break;
			}
		}
		input.close();
	}

}
