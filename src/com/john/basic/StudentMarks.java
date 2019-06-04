//different methods are used to calculate total and percentage
package com.john.basic;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		inputMethod();
	}

	public static void inputMethod() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter maths marks");
		int mathsmarks = input.nextInt();
		System.out.println("Enter physics marks");
		int physicsmarks = input.nextInt();
		System.out.println("Enter chemistry marks");
		int chemistrymarks = input.nextInt();
		int actualmarks = 300;
		int Total = calulateTotal(mathsmarks, physicsmarks, chemistrymarks);
		calculatePercentage(Total, actualmarks);
		input.close();
	}

	public static int calulateTotal(int mathsmarks, int physicsmarks, int chemistrymarks) {
		int Total = mathsmarks + physicsmarks + chemistrymarks;
		display(Total);
		return Total;
	}

	public static void calculatePercentage(int total, int actual) {

		float percentage = (float) total / actual * 100;
		display(percentage);
	}

	public static void display(int todisplay) {
		System.out.println("Total: " + todisplay);
	}

	public static void display(float todisplay) {
		System.out.println("percentage: " + todisplay);
	}
}
