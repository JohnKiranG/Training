package com.john.io.bytestream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream input = new FileInputStream("DataOutputStream");
		DataInputStream inst = new DataInputStream(input);
		int count = input.available();
		byte[] arr = new byte[count];
		inst.read(arr);
		for (byte bt : arr) {
			char k = (char) bt;
			System.out.print(k + "-");
		}
		input.close();
		inst.close();
	}
}
