package com.john.array;

public class MultiArray {
	public static void main(String args[]) {
		// declaring and initializing 2D array
		String arr[][] = { { "john   ", "manoj  ", "rupa   " }, { "sarvani", "anantha", "jyothi " }, { "sravani", "vijay  ", "prime" } };

		// printing 2D array in line
		System.out.println("Printing array in line:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("arr " + i + " " + j + ": " + arr[i][j] + " ");
			}
		}

		// printing in array format
		System.out.println("Printing in form of matrix:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
