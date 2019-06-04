package com.john.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleForPrepareStatement {
	public static void main(String[] args) {
		Connection conn = CreateConnection.createConnection();
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement("insert into doctor values(?,?,?)");  
			
			ps.setInt(1,3);//1 specifies the first parameter in the query  
			ps.setString(2,"Ratan"); 
			ps.setInt(3, 80);
			int i=ps.executeUpdate();  
			System.out.println(i+" records inserted");  
			
		} catch (SQLException e) {
			e.printStackTrace();
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
			} finally {
				System.out.println("successfully closed connections");
			}
		}

	}
}
