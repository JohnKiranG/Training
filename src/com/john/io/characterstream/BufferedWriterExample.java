package com.john.io.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
	public static void main(String[] args)  {
		BufferedWriter buffer=null;
		try {
			buffer = new BufferedWriter(new FileWriter("BufferedWriterExample"));
			String content = "Using BufferedWriter!";
			buffer.write(content);					//write()
			buffer.append("\nit is appended");		//append()
			buffer.write("\nthis is written");		//write()
			buffer.flush();							//flush()
			buffer.close();							//close()
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Success");
	}
}