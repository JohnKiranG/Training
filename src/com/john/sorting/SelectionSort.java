package com.john.sorting;

public class SelectionSort {
	public static void main(String args[]) {

		int array[] = { 20, 12, 10, 15, 2 };
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(array[i]);

		}

	}

}
