package com.john.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleForStatementInterface {
	public static void main(String[] args) {
		// by using executeUpdate in statement interface we can do non select queries 
		Connection conn = CreateConnection.createConnection();

		Statement st = null;
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			st = conn.createStatement();
//			System.out.println("===================================");
//			System.out.println("deletes column in the table");
//			st.executeUpdate("alter table doctor drop column data");
			
//			System.out.println("Enter Id");
//			String s1 = br.readLine();
//			int id1 = Integer.parseInt(s1);

			System.out.println("Enter Name");
			String name1 = br.readLine();

			System.out.println("Enter psswd");
			String psswd1 = br.readLine();
//			int psswd1 = Integer.parseInt(s3);
			
			//String sqlStatement=br.readLine();
			
			System.out.println("====================");
			System.out.println("Inserting data....");
			//st.executeUpdate("insert into doctor values ("+id1+",'"+name1+"',"+age1+")");
			st.executeUpdate("delete from doctor where name='"+name1+"' and psswd='"+psswd1+"' ");
			System.out.println("Data inserted");

//			System.out.println("====================");
//			System.out.println("Updating data....");
//			int result = st.executeUpdate("update doctor set name='ravi',age=55 where id=3");
//			System.out.println("Updated data:"+result);
//			
//			System.out.println("====================");
//			System.out.println("Deleting data....");
//			int result1 = st.executeUpdate("delete from doctor where id=3");
//			System.out.println("Data deleted....");
//			System.out.println("Deleted data:"+result1);
			
//			System.out.println("====================");
//			System.out.println("added new column into database");
//			st.executeUpdate("alter table doctor add data number(255)");
			
			

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
