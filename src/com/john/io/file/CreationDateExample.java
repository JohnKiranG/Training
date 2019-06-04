package com.john.io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CreationDateExample {

    public static LocalDateTime getCreationDateTime () throws IOException {
    	File f = new File("/home/johnkiran/john-java/Basic Programs/Armstrong.java");
            BasicFileAttributes attr = Files.readAttributes(f.toPath(),
                                                            BasicFileAttributes.class);
            return attr.creationTime()
                       .toInstant()
                       .atZone(ZoneId.systemDefault())
                       .toLocalDateTime();
    }
    public static void main(String[] args) throws IOException {
		
    	System.out.println(getCreationDateTime());
	}

}