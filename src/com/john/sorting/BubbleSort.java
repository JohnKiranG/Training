package com.john.sorting;

public class BubbleSort {
	public static void main(String args[]) {

		int array[] = { 5, 6, 3, 4, 2, 1 };
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);

		}

	}

}
