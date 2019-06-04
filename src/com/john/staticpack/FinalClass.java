//it is used to test final class cannot be inherited
package com.john.staticpack;

final public class FinalClass {
	void run() {
		System.out.println("running");
	}
	public static void main(String args[]) {
		System.out.println("final class cannot be inherited");
	}

}
