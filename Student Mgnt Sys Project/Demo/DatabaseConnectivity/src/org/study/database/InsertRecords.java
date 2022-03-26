package org.study.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecords {

	public static void main(String[] args) {
		   String jdbcUrl = "jdbc:mysql://localhost:3306/";
		    String username = "root";
		    String password = "Success123!";

		    Connection conn = null;
		    Statement stmt = null;

		    try {
		      conn = DriverManager.getConnection(jdbcUrl, username, password);
		      
		      stmt = conn.createStatement();

		      String record1="INSERT INTO users (userid, username, email) "+"VALUES (3,'Rahul','rahul@gmail.com')";
		      //stmt.executeUpdate(record1);
		      
		      String record2="INSERT INTO users (userid, username, email) "+"VALUES (4,'Ramesh','ramesh@gmail.com')";
		      //stmt.executeUpdate(record2);

		      System.out.println("Records inserted");

		    } catch (SQLException e) {
		      e.printStackTrace();
		    } finally {
		      try {
		        if (stmt != null) {
		          stmt.close();
		        }
		        if (conn != null) {
		          conn.close();
		        }
		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		    }
		  }
		
	}


