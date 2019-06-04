package com.john.io.characterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String args[]) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("BufferedWriterExample");
			
			 //ready() is used to check stream is ready or not
			System.out.println("stream is ready or not: "+fr.ready()); 		
			br = new BufferedReader(fr);
			
			//readline is used to read line by line
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
			//read is used to read char by char
			int i;
			while ((i = br.read()) != -1) {						
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}
}