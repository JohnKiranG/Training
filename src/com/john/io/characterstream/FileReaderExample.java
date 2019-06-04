package com.john.io.characterstream;

import java.io.FileReader;

public class FileReaderExample {  
    public static void main(String[] args) {  
        try  {  
        	FileReader reader = new FileReader("FileWriterExample");  
        	System.out.println("stream is ready or not: "+reader.ready());  //ready()
        	int i;  
            while ((i = reader.read()) != -1) {  							//read
                System.out.print((char) i);  
            }  
            reader.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  
}