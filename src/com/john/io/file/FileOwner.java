package com.john.io.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

public class FileOwner {
	public static void main(String[] args) {
		String A = "/home/johnkiran/john-java/";
		Path path = Paths.get(A);
		FileOwnerAttributeView view = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
		UserPrincipal userPrincipal = null;
		try {
			userPrincipal = view.getOwner();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		System.out.println("Owner of the file is :" + userPrincipal.getName());
	}
}
