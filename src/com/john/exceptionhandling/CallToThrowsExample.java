package com.john.exceptionhandling;

import java.util.Scanner;

import com.john.exceptionhandling.ThrowsExample;

public class CallToThrowsExample {
	public static void main(String args[]) {
		System.out.println("Enter any two number: ");
		Scanner s = new Scanner(System.in);
		try {
			int firstNumber = s.nextInt();
			int secondNumber = s.nextInt();
			ThrowsExample dz = new ThrowsExample();
			dz.division(firstNumber, secondNumber);
		} catch (Exception e) {
			System.err.println(e);
		}
	s.close();
	}
}