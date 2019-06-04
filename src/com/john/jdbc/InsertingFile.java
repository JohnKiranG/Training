package com.john.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingFile {

	public static void main(String[] args) throws Exception {
		Connection conn = CreateConnection.createConnection();
		System.out.println("=============================================");
		System.out.println("Persons table has been created");
		System.out.println("It contains Id, lastname , firstname, resume,photo, address, city");
		System.out.println("=============================================");

		PreparedStatement ps = null;
		try {
			 System.out.println("=============================================");
			 System.out.println("inserting data........");
			 ps=conn.prepareStatement("insert into persons values(?,?,?,?,?,?,?)");
			 ps.setInt(1,1);
			 ps.setString(2, "kiran");
			 ps.setString(3, "john");
			 ps.setString(4, null);
			 ps.setString(5, null);
			 ps.setString(6, "2-36");
			 ps.setString(7, "kkd");
			 ps.executeUpdate();
			 System.out.println("inserted data.....");
			 System.out.println("=============================================");
			 ps.close();

			System.out.println("inserting file.......");
			String updateResume = "update persons set resume=? where personid=?";
			ps = conn.prepareStatement(updateResume);

			File f = new File("kiranResume.txt");
			FileInputStream input = new FileInputStream(f);

			ps.setBinaryStream(1, input);
			ps.setInt(2, 1);
			ps.executeUpdate();
			System.out.println("inserted file.");

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
