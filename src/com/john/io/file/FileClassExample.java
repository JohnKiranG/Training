package com.john.io.file;

import java.io.File;
import java.io.IOException;

public class FileClassExample {
	public static void main(String[] args) {
		File f = new File("/home/johnkiran/john-java/");

		System.out.println("f: " + f);
		f.mkdirs();
		System.out.println("path exists: " + f.exists());
		try {
			System.out.println("created file:" + f.createNewFile());
		} catch (IOException e) {
			// e.printStackTrace();
		}
		System.out.println("readable operation: " + f.setReadable(true));
		System.out.println("directory: " + f.isDirectory());
		System.out.println("file: " + f.isFile());
		System.out.println("parent path: " + f.getParentFile());
		System.out.println("get path: " + f.getPath());
		System.out.println("absolute path: " + f.getAbsolutePath());
		System.out.println("is absolute: " + f.isAbsolute());
		try {
			System.out.println("canonical path: " + f.getCanonicalPath());
		} catch (IOException e) {
			// e.printStackTrace();
		}
		System.out.println("get name: " + f.getName());

		System.out.println("file length: " + f.length());

		File files[] = f.listFiles();
		try {
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}

		try {
			String array[] = f.list();
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e1) {
			// e1.printStackTrace();
		}
		System.out.println("get total space:  " + f.getTotalSpace());
		System.out.println("get free space:   " + f.getFreeSpace());
		System.out.println("get usable space:  " + f.getUsableSpace());

		System.out.println("getAbsoluteFile: " + f.getAbsoluteFile());
		System.out.println("getParenFile:" + f.getParentFile());
		try {
			System.out.println("getCanonicalFile: " + f.getCanonicalFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("can write: " + f.canWrite());
		System.out.println("can Read: " + f.canRead());
		System.out.println("can execute: " + f.canExecute());

		System.out.println("last modified: " + f.lastModified());

		// System.out.println("deleted: " + f.delete());
	}
}
