package com.john.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingImage {
	public static void main(String[] args) throws Exception {
		Connection conn = CreateConnection.createConnection();
		System.out.println("=============================================");
		System.out.println("Persons table has been created");
		System.out.println("It contains Id, lastname , firstname, resume, photo, address, city");
		System.out.println("=============================================");

		PreparedStatement ps = null;
		try {
			System.out.println("inserting image.......");
			String updateResume = "update persons set photo=? where personid=?";
			ps = conn.prepareStatement(updateResume);

			File f = new File("1.png");
			FileInputStream input = new FileInputStream(f);

			ps.setBinaryStream(1, input);
			ps.setInt(2, 1);
			ps.executeUpdate();
			System.out.println("inserted image.");

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
