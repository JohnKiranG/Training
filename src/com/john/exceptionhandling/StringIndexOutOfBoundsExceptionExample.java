//it is used to check StringIndexOutOfBoundsException
package com.john.exceptionhandling;

public class StringIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		try {
			String name = "Hello";
			name.charAt(3);
			// Exception raised occurs here
			name.charAt(10);
		} catch (StringIndexOutOfBoundsException sob) {
			System.out.println("StringIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println("Invalid");
		} finally {
			System.out.println("You are trying to access location which is not created");
		}

	}

}
