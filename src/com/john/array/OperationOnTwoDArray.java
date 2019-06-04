package com.john.array;

import java.util.Scanner;

public class OperationOnTwoDArray {
	public static void main(String[] args) {
		System.out.print("Enter rows and columns of your array1:");
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int columns = input.nextInt();
		int arrayOne[][] = new int[rows][columns];
		int arrayTwo[][] = new int[rows][columns];
		int arrayThree[][] = new int[rows][columns];

		insertArrayOne(input, rows, columns, arrayOne);

		insertArrayTwo(input, rows, columns, arrayTwo);

		addArrays(rows, columns, arrayOne, arrayTwo);

		multiplyArrays(rows, columns, arrayOne, arrayTwo, arrayThree);
		
		transposeArray(rows, columns, arrayOne);
		
		input.close();
	}

	private static void transposeArray(int rows, int columns, int[][] arrayOne) {
		System.out.println("Transpose of matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arrayOne[j][i] + " ");
			}
			System.out.println();
		}
	}

	private static void multiplyArrays(int rows, int columns, int[][] arrayOne, int[][] arrayTwo, int[][] arrayThree) {
		System.out.println("Multiplication of arrays:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < rows; k++) {
					arrayThree[i][j] += arrayOne[i][k] * arrayTwo[k][j];
				}
				System.out.print(arrayThree[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void addArrays(int rows, int columns, int[][] arrayOne, int[][] arrayTwo) {
		System.out.println("Addition of arrays:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print((arrayOne[i][j] + arrayTwo[i][j]) + " ");
			}
			System.out.println();
		}
	}

	private static void insertArrayTwo(Scanner input, int rows, int columns, int[][] arrayTwo) {
		System.out.println("Enter elements of array2:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arrayTwo[i][j] = input.nextInt();
			}
		}
	}

	private static void insertArrayOne(Scanner input, int rows, int columns, int[][] arrayOne) {
		System.out.println("Enter elements of array1:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arrayOne[i][j] = input.nextInt();
			}
		}
	}
}
