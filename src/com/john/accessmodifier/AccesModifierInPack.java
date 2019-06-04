//access modifier within package
package com.john.accessmodifier;

public class AccesModifierInPack {

	public static void main(String[] args) {
		ExampleForAccesModifier eam = new ExampleForAccesModifier();

		// System.out.println(ExampleForAccesModifier.privatevariable);
		System.out.println(ExampleForAccesModifier.defaultVariable);
		System.out.println(ExampleForAccesModifier.protectedVariable);
		System.out.println(eam.publicVariable);
		// ExampleForAccesModifier.privateMethod();
		ExampleForAccesModifier.defaultMethod();
		ExampleForAccesModifier.protectedMethod();
		ExampleForAccesModifier.publicMethod();
	}

}
