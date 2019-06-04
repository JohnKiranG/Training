package com.john.io.characterstream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
	public static void main(String[] args) {
		//this block writes into file
		try {
			FileOutputStream outputStream = new FileOutputStream("OutputStreamWriter.txt");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

			outputStreamWriter.write("Using output stream writer");

			outputStreamWriter.close();
			System.out.println("into file written is completed");
		} catch (Exception e) {
			e.getMessage();
		}
		//this block takes character form console and writes in it
		try {
			System.out.println("enter a char or string");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);

			outputStreamWriter.write(System.in.read());

			outputStreamWriter.close();
			System.out.println("done");
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
