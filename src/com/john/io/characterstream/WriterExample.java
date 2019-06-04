package com.john.io.characterstream;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("WriterExample");
			String content = "Using Writer in that FileWriter!";
			w.write(content);					//write()
			w.append("\nit is appended");		//append()
			w.write("\nthis is written");		//write()
			w.flush();							//flush()
			w.close();							//close()
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}