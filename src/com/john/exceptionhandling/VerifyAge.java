// it is used in custom exception
package com.john.exceptionhandling;

import java.util.Scanner;

public class VerifyAge {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age");
		Scanner s = new Scanner(System.in);
		age = s.nextInt();
		try {
			CheckAge ca = new CheckAge();
			ca.verify(age);
			
		}catch (AgeException ae) {
			//System.err.println(ae);
			ae.printStackTrace();
			//System.err.println(ae.getMessage());
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("final");
		}
		System.out.println("still it is executed");
		s.close();
	}

}
