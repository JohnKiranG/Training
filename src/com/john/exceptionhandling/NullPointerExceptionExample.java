//it is used to check NullPointerException
package com.john.exceptionhandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			//String s=null;
			//NullPointerException  
		//	System.out.println(s.length());
		} catch (NullPointerException  np) {
			np.printStackTrace();
			//or you can show like this System.out.println("NullPointerException");
		} catch (Exception e) {
			System.out.println("Invalid");
		} finally {
			System.out.println("You are trying to assign null location string");
		}
	}

}
