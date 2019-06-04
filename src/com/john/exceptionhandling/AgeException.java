//it is custom exception
package com.john.exceptionhandling;

public class AgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public AgeException(String s) {
		super(s);
	}
}
