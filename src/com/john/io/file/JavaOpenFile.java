//it is code to open file in editor you can use in eclipse or terminal
package com.john.io.file;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class JavaOpenFile {

	public static void main(String[] args) throws IOException {
		// text file, should be opening in default text editor
		File file = new File("/home/johnkiran/workspace/Training/src/com/john/io/characterstream/BufferedWriterExample.txt");

		// first check if Desktop is supported by Platform or not
		if (!Desktop.isDesktopSupported()) {
			System.out.println("Desktop is not supported");
			return;
		}

		Desktop desktop = Desktop.getDesktop();
		if (file.exists())
			desktop.open(file);

		// let's try to open PDF file
		file = new File("/home/johnkiran/workspace/Training/src/com/john/io/characterstream/BufferedWriterExample.txt");
		if (file.exists())
			desktop.open(file);
	}

}
