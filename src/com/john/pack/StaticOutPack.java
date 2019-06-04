package com.john.pack;

import com.john.staticpack.ExampleForStaticKey;

public class StaticOutPack {
	public static void main(String args[]) {
		ExampleForStaticKey obj = new ExampleForStaticKey();
		System.out.println("normal variable: " + obj.normalVariable);
		System.out.println("static variable: " + ExampleForStaticKey.staticVariable);
		obj.normalMethod();
		ExampleForStaticKey.staticMethod();

	}
}
