package com.john.io.bytestream;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("FileInputStream");
			System.out.println("enter a string");
			Scanner input=new Scanner(System.in);
			String s=input.nextLine();
			byte b[]=s.getBytes();
			input.close();
			fout.write(b);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
