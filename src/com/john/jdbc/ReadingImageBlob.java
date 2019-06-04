package com.john.jdbc;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadingImageBlob {
	public static void main(String[] args) {
		Connection conn = CreateConnection.createConnection();
		PreparedStatement ps = null;
		try {
			System.out.println("=============================================");
			// creating sql statement
			String sqlRetrive = "select photo from persons where personid=1";
			ps = conn.prepareStatement(sqlRetrive);

			ResultSet rs = ps.executeQuery();

			FileOutputStream output = new FileOutputStream(
					"/home/johnkiran/workspace/Training/src/com/john/jdbc/pic.png");

			System.out.println("=============================================");
			// reads file from database and writes into another file
			System.out.println("reading image.......");
			while (rs.next()) {
				InputStream input = rs.getBinaryStream("photo");
				byte[] buffer = new byte[1024];
				while (input.read(buffer) > 0) {
					output.write(buffer);
				}
			}
			System.out.println("saved image.");
			output.close();
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
