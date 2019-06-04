//it is example how to access static variable and method
package com.john.staticpack;

public class StaticInPack {
	public static void main(String args[]) {
		ExampleForStaticKey obj = new ExampleForStaticKey();
		System.out.println("normal variable: " + obj.normalVariable);
		System.out.println("static variable: " + ExampleForStaticKey.staticVariable);
		obj.normalMethod();
		ExampleForStaticKey.staticMethod();

	}
}
