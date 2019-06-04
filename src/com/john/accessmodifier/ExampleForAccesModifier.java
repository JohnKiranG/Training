//access modifier within class
package com.john.accessmodifier;

public class ExampleForAccesModifier {
	private static String privateVariable = "privatevariable";
	static String defaultVariable = "defaultvariable";
	protected static String protectedVariable = "protectedvariable";
	public String publicVariable = "publicvariable";

	private static void privateMethod() {
		System.out.println("private method is called");
	}

	static void defaultMethod() {
		System.out.println("default method is called");
	}

	protected static void protectedMethod() {
		System.out.println("protected method is called");
	}

	public static void publicMethod() {
		System.out.println("public method is called");
	}

	public static void main(String args[]) {
		ExampleForAccesModifier eam = new ExampleForAccesModifier();
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(eam.publicVariable);
		privateMethod();
		defaultMethod();
		protectedMethod();
		publicMethod();
	}

}
