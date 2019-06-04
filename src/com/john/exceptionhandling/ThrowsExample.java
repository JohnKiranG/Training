package com.john.exceptionhandling;

public class ThrowsExample {
	public void division(int firstNumber, int secondNumber) throws ArithmeticException {
		if (secondNumber == 0) {
			ArithmeticException ae = new ArithmeticException();
			throw ae;
		} else {
			int answer = firstNumber / secondNumber;
			System.out.println("Result: " + answer);
		}
	}

}
