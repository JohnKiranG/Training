package com.john.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ExampleForRsmd {
	public static void main(String[] args) {
		Connection conn = CreateConnection.createConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement("select * from doctor");
			rs=ps.executeQuery();  
			ResultSetMetaData rsmd=rs.getMetaData();  
			System.out.println("=======================================");
			System.out.println("Column details of Doctor Table");
			System.out.println("=======================================");
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
			System.out.println("Label of 1st column: "+rsmd.getColumnLabel(1));
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
			
			System.out.println("Sql Type of 1st column: "+rsmd.getColumnType(1));
			System.out.println("Column Display Size of 1st column: "+rsmd.getColumnDisplaySize(1));
			System.out.println("=======================================");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				ps.close();
				rs.close();
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
