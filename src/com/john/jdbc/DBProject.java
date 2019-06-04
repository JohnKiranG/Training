package com.john.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBProject {
	public static void main(String[] args) {
		Connection con = CreateConnection.createConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the sql statement");
	
		
		try {

		//	String sqlStatement=br.readLine();
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into doctor values(?,?,?)");
			//PreparedStatement ps = con.prepareStatement("insert into doctor values(?,?,?)");

			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("=============================================");
				System.out.println("This code adds data into your doctor table");
				System.out.println("=============================================");
				System.out.println("Enter Id");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);

				System.out.println("Enter Name");
				String name = br.readLine();

				System.out.println("Enter Age");
				String s3 = br.readLine();
				int age = Integer.parseInt(s3);

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);

				ps.executeUpdate();

				System.out.println("=============================================");
				System.out.println("Commit/Rollback");
				String answer = br.readLine();
				if (answer.equals("commit")) {
					con.commit();
				}
				if (answer.equals("rollback")) {
					con.rollback();
				}

				System.out.println("=============================================");
				System.out.println("Want to add more records y/n");
				String ans = br.readLine();
				if (ans.equals("n")) {
					break;
				}
			}
			// con.commit();
			System.out.println("=============================================");
			System.out.println("Record successfully saved");

			con.close();// before closing connection commit() is called
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
