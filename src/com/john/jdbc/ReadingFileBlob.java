package com.john.jdbc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadingFileBlob {
	public static void main(String[] args) {
		Connection conn = CreateConnection.createConnection();
		PreparedStatement ps = null;
		try {
			System.out.println("=============================================");
			// creating sql statement
			String sqlRetrive = "select resume from persons where personid=1";
			ps = conn.prepareStatement(sqlRetrive);

			ResultSet rs = ps.executeQuery();
			// giving file name
			File f = new File("writingintofile.txt");
			FileOutputStream output = new FileOutputStream(f);
			// displays file name
			System.out.println("Writing to file " + f.getAbsolutePath());
			System.out.println("=============================================");
			// reads file from database and writes into another file
			System.out.println("reading file.......");
			while (rs.next()) {
				InputStream input = rs.getBinaryStream("resume");
				byte[] buffer = new byte[1024];
				while (input.read(buffer) > 0) {
					output.write(buffer);
				}
			}
			System.out.println("saved file.");
			output.close();
			// displays file content on console
			try {
				System.out.println("=============================================");
				FileReader reader = new FileReader("writingintofile.txt");
				System.out.println("stream is ready : " + reader.ready()); // ready()
				System.out.println("=============================================");
				int i;
				while ((i = reader.read()) != -1) { // read
					System.out.print((char) i);
				}
				reader.close();
			} catch (Exception e) {
				e.getMessage();
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
	}
}
