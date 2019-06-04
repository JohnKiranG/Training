// it is used in custom exception
package com.john.exceptionhandling;

import com.john.exceptionhandling.AgeException;

public class CheckAge {
	public void verify(int age) throws AgeException {
		if (age > 0) {
			System.err.print("valid age");
		} else {
			AgeException ae = new AgeException("Invalid Meassage");
			throw ae;
		}
	}
}