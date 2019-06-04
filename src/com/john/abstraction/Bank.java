// this is used in ExampleForAbstraction
package com.john.abstraction;

public abstract class Bank {
	Bank() {
		System.out.println("constructor is called");
	}

	abstract int getRateOfInterest();

}
