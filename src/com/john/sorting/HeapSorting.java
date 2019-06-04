package com.john.sorting;

public class HeapSorting {
	static void heapify(int[] arr, int size, int leaf) {
		int largest = leaf;
		int left = 2 * leaf + 1;
		int right = 2 * leaf + 2;
		int temp;
		if (left < size && arr[left] > arr[largest])
			largest = left;

		if (right < size && arr[right] > arr[largest])
			largest = right;

		if (largest != leaf) {
			temp = arr[leaf];
			arr[leaf] = arr[largest];
			arr[largest] = temp;
			heapify(arr, size, largest);
		}
	}

	static void heapSort(int[] arr, int size) {

		int temp;
		for (int leaf = size / 2 - 1; leaf >= 0; leaf--)
			heapify(arr, size, leaf);

		for (int i = size - 1; i >= 0; i--) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}

	}

	public static void main(String args[]) {
		int[] arr = { 1, 14, 10, 8, 7, 9, 3, 2, 4, 6 };
		// int size=arr.length;
		heapSort(arr, 10);
		System.out.println("printing sorted elements");
		for (int i = 0; i < 10; ++i)
			System.out.println(arr[i]);
	}
}
