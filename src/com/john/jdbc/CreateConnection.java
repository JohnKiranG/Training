package com.john.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	public static Connection createConnection() {
		Connection conn = null;

		try {
			System.out.println("Loading h2 driver......");

			Class.forName("org.h2.Driver");

			System.out.println("Driver Loaded.");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","john","12345");
//			the below connection asks to release the connection in terminal
//			conn = DriverManager.getConnection("jdbc:h2:~/test", "john", "12345");

			System.out.println("Connection established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return conn;
	}
}
