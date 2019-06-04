package com.john.io.characterstream;

import java.io.*;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("WriterExample");
			System.out.println("stream is ready or not: "+reader.ready());  //ready()
			int data = 0;
			while ((data = reader.read()) != -1) {							//read()
				System.out.print((char) data);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}