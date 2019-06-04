package com.john.io.bytestream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("DataOutputStream");  
        DataOutputStream data = new DataOutputStream(file);
        String s="using DataOutputStream";
        //Long v=25;
        data.writeBytes(s);
        data.writeInt(65);
        //data.writeLong(v);
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }
}
