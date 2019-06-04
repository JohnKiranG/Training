//Access Modifier outside package
package com.john.pack;

import com.john.accessmodifier.ExampleForAccesModifier;

public class AccesModifierOutPackInherit extends ExampleForAccesModifier{

	public static void main(String[] args) {
		ExampleForAccesModifier eam = new ExampleForAccesModifier();

		// System.out.println(ExampleForAccesModifier.privateVariable);
		//System.out.println(ExampleForAccesModifier.defaultVariable);
		System.out.println(ExampleForAccesModifier.protectedVariable);
		System.out.println(eam.publicVariable);
		// ExampleForAccesModifier.privateMethod();
		//ExampleForAccesModifier.defaultMethod();
		ExampleForAccesModifier.protectedMethod();
		publicMethod();
	}

}
