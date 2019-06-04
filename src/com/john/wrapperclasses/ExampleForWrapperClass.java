package com.john.wrapperclasses;

public class ExampleForWrapperClass {
	public static void main(String args[]) {
		// step1:converting int variable to Integer object using method
		int intVariable = 500;
		Integer integerObject = Integer.valueOf(intVariable);
		System.out.println("int to Integer: " + integerObject);

		// step2:converting int variable to Integer object using autoboxing
		intVariable = 2;
		integerObject = intVariable;
		System.out.println("int to Integer autoboxing: " + integerObject);

		// step3:converting Integer object to int variable using method
		Integer secondIntegerObject = new Integer(intVariable);
		System.out.println("int to Integer constructor: " + secondIntegerObject);

		int secondVariable = secondIntegerObject.intValue();
		System.out.println("Integer to int: " + secondVariable);

		// step4:converting Integer object to int variable using unboxing
		int thirdVariable = secondIntegerObject;
		System.out.println("Integer to int unboxing: " + thirdVariable);

		// step5: Integer to string
		Integer thirdIntegerObject = new Integer(intVariable);
		String str = thirdIntegerObject.toString();
		System.out.println("Integer to string: " + str);

		// step6: string to Integer
		Integer fourthIntegerObject = new Integer("56");
		System.out.println("string to Integer: " + fourthIntegerObject);

		// step7: int to string
		String str1 = String.valueOf(intVariable);
		System.out.println("int to string: " + str1);

		// step8: string to int
		intVariable = Integer.parseInt("abcd",27);
		System.out.println("string to int: " + intVariable);

		// step9: float to Float
		float floatVariable = 12.567f;
		Float floatObject = floatVariable;
		System.out.println("float to Float: " + floatObject);

		// step10: Float toInteger
		Integer intObject = (int) floatObject.floatValue();
		System.out.println(intObject);

		// step11: float to Integer
		Integer secondIntObject = (int) floatVariable;
		System.out.println(secondIntObject);
	
	}
}
