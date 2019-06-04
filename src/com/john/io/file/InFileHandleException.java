package com.john.io.file;

import java.io.File;
import java.io.IOException;

public class InFileHandleException {
	public static void main(String[] args) {
		File f = new File("/home/johnkiran/john/new/");
		try {
			create(f);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try {
			path(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void create(File f) throws IOException {
		try {
			System.out.println("created file:" + f.createNewFile());
		} catch (IOException e) {
			throw new IOException("entered invalid directory");
		}
		System.out.println("create is executed");
	}

	private static void path(File f) throws IOException {
		System.out.println("canonical path: " + f.getCanonicalPath());
		System.out.println("path is executed");
	}

}