package com.john.sorting;

public class InsertionSort {
	public static void main(String args[]) {

		int array[] = { 20, 12, 10, 15, 2 };
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);

		}

	}

}
