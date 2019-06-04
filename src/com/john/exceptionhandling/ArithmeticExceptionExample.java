//it is the code that gives arthimetic exception-checked exception-runtime
package com.john.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		int firstNumber, secondNumber, ans = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		try {
			firstNumber = s.nextInt();
			secondNumber = s.nextInt();
			ans = firstNumber / secondNumber;
			System.out.println("Result: " + ans);
		} catch (ArithmeticException ae) {
			String msg = ae.getMessage();
			System.out.println(msg);
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Invalid");
		} finally {
			System.out.println("Please check your input");
		}
		s.close();
	}
}
