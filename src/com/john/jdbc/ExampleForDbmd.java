package com.john.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class ExampleForDbmd {

	public static void main(String[] args) {
		Connection conn = CreateConnection.createConnection();

		try {
			DatabaseMetaData dbmd=conn.getMetaData();  
	  
			System.out.println("=======================================");
			System.out.println("Gives Information about Database");
			System.out.println("=======================================");
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
			System.out.println("Database URL: "+dbmd.getURL());
			System.out.println("=======================================");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
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
