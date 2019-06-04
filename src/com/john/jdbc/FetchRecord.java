package com.john.jdbc;

import java.sql.*;

class FetchRecord {
	public static void main(String args[]) {

		Connection conn = CreateConnection.createConnection();

		Statement st = null;

		try {
			st = conn.createStatement();
			System.out.println("=================================");
			System.out.println("Data from Doctor table");
			System.out.println("=================================");
			System.out.println("Doctor ID\tDoctor Name\tDoctor Age");
			ResultSet rs = st.executeQuery("select * from doctor");
			
			while(rs.next()) {
				System.out.println("   "+rs.getString("id")+"\t\t   "+rs.getString("name")+"\t\t  "+rs.getString("age"));
			}
//			//absolute is used to move cursor to that line
//			rs.absolute(1);
//			System.out.println("==========================");
//			System.out.println("contents of row1: ");
//			System.out.println("==========================");
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
//			System.out.println("==========================");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("successfully closed connections");
			}
		}
	}
}