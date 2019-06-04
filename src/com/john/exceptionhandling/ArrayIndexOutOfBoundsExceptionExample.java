//it is used to check ArrayIndexOutOfBoundsException
package com.john.exceptionhandling;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		int array[] = new int[5];
		try {
			// ArrayIndexOutOfBoundsException occurs here
			array[10] = 100;
		} catch (ArrayIndexOutOfBoundsException aob) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Invalid");
		} finally {
			System.out.println("You are trying to initialise location which is not created");
		}

	}
}
