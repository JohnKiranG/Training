package com.john.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		//Step1: creating instance of the encapsulated class
		ExampleForEncapsulation ee = new ExampleForEncapsulation();
		//Step2: setting value in the name member
		ee.setName("John");
		//Step3: getting value of the name member
		System.out.println(ee.getName());
		
		ee.setNumber(5);
		System.out.println(ee.getNumber());
	}
}
