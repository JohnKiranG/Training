package com.john.sorting;

public class QuickSort {
	public static void main(String[] args) {

		int[] arr = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		int phase = 0;
		quickSort(arr, 0, 9, phase, "chaitu");
		System.out.println("\n The sorted array is: \n");

	}

	public static int partition(int a[], int beg, int end, int phase) {

		int left, right, temp, loc, flag;
		loc = left = beg;
		right = end;
		flag = 0;

		while (flag != 1) {
			while ((a[loc] <= a[right]) && (loc != right))
				right--;
			if (loc == right)
				flag = 1;
			else if (a[loc] > a[right]) {
				temp = a[loc];
				a[loc] = a[right];
				a[right] = temp;
				loc = right;
			}
			if (flag != 1) {
				while ((a[loc] >= a[left]) && (loc != left))
					left++;
				if (loc == left)
					flag = 1;
				else if (a[loc] < a[left]) {
					temp = a[loc];
					a[loc] = a[left];
					a[left] = temp;
					loc = left;
				}
			}
		}

		for (int i = 0; i < 10; i++) {

			System.out.print(a[i] + "  ");

		}
		System.out.println("phase:" + phase);
		System.out.print(" loc:" + loc + " ");
		return loc;
	}

	static void quickSort(int a[], int beg, int end, int phase, String name) {

		int loc;

		if (beg < end) {
			// System.out.print(" end:"+end+"\n"+name);
			loc = partition(a, beg, end, (phase + 1));
			quickSort(a, beg, loc - 1, (phase + 1), "john");
			quickSort(a, loc + 1, end, (phase + 1), "sarvani");
		}
	}
}