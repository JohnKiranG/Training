// it is used to test final variable
package com.john.staticpack;

public class FinalVariable {
	// final variable
	final int speedLimit = 90;

	void run() {
		//speedlimit = 400;//here it shows error
	}

	public static void main(String args[]) {
		FinalVariable obj = new FinalVariable();
		obj.run();
	}
}
