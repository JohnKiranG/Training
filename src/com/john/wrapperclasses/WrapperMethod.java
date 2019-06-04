package com.john.wrapperclasses;

public class WrapperMethod {
	static void method(Integer first, Integer second) {
		if (first == second) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}

	public static void main(String[] args) {

		method(-128, -128);

		method(200, 200);
		
		method(128,128);
	}

}
