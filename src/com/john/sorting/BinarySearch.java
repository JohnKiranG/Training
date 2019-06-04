package com.john.sorting;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter the size");
		int size = input.nextInt();

		int a[];
		a = new int[size];
		System.out.println("enter the elements in order");
		for (int i = 0; i < size; i++) {
			a[i] = input.nextInt();
		}

		int low = 0, high = size, mid;

		System.out.println("enter the elements to find");
		int number = input.nextInt();

		while (low < high) {
			mid = (low + high) / 2;

			if (number == a[mid]) {
				System.out.println("the number is found in:" + mid);
				break;

			} else if (number > a[mid])
				low = mid++;

			else {
				high = mid--;
			}

		}
		input.close();
	}

}
