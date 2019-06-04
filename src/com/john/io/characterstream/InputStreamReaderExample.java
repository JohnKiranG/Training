//it is used to take data from file or from console and prints on console
package com.john.io.characterstream;

//import java.io.FileInputStream;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) {
		try {
			//InputStream stream = new FileInputStream("file.txt");
			Reader reader = new InputStreamReader(System.in);
			//reader.get
			int data = reader.read();
			while (data != -1) {
				System.out.println((char) data);
				data = reader.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
