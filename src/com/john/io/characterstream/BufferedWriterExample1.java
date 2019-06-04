package com.john.io.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriterExample1 {
	public static void main(String[] args) throws Exception  {
		BufferedWriter buffer=null;
			buffer = new BufferedWriter(new FileWriter("BufferedWriterExample"));
			String content = "Using BufferedWriter!";
			buffer.write(content);					//write()
			buffer.append("\nit is appended");		//append()
			buffer.write("\nthis is written");		//write()
			buffer.flush();							//flush()
			buffer.close();							//close()
			buffer.close();
			System.out.println("Success");
	}
}