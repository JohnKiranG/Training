//in jagged array columns size can be varied
package com.john.array;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		System.out.println("Enter rows of your array");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int arr[][] = new int[rows][];
		System.out.println("Enter columns in each row");
		for (int i = 0; i < rows; i++) {
			System.out.print("Row"+i+":");
			arr[i] = new int[input.nextInt()];
		}
		
		// initializing a jagged array
		System.out.println("enter values to store in array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		// printing the data of a jagged array
		System.out.println("Elements in array are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		input.close();
	}
}
