package com.john.array;
import java.util.Scanner;
public class SingleArray {
	public static void main(String args[]) {
		// declaration and instantiation
		System.out.println("Enter size of your array:");
		Scanner input = new Scanner(System.in);
		Integer array[] = new Integer[input.nextInt()];
		// initialization
		System.out.println("Enter elements of array:");
		for (int count = 0; count < array.length; count++) {
			array[count]=input.nextInt();
		}
		// Printing array
		System.out.println("Elements in array are:");
		for (int count = 0; count < array.length; count++) {
			System.out.print(array[count]+" ");
		}
		//using foreach loop
		System.out.println("\nusing foreach loop:");
		for(int a:array) {
			System.out.print(a+" ");
		}
	input.close();
	}
}
