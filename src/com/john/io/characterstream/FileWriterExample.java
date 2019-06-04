package com.john.io.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("FileWriterExample");
			fw.write(System.in.read());			//write()
			fw.append("\nit is appended");		//append()
			fw.write("\nthis is written");		//write()
			fw.flush();							//flush()
			fw.close();							//close()
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}