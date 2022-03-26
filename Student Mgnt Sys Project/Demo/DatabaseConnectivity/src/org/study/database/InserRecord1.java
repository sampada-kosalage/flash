package org.study.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InserRecord1 {

	public static void main(String[] args) {
		static int userid;
		   static String username;
		   static String email;
		   public static void main1(String[] args) {
		      String JdbcURL = "jdbc:mysql://localhost:3306/sample?useSSL=false";
		      String Username = "root";
		      String password = "123456";
		      Connection con = null;
		      Scanner keyboardInput=new Scanner(System.in);
		      PreparedStatement pstmt = null;
		      String query = "INSERT INTO CourseDemo(CourseId, StudentName, CourseName)" + "VALUES (?, ?, ?)";
		      try {
		         con = DriverManager.getConnection(JdbcURL, Username, password);
		         input(keyboardInput);
		         pstmt = con.prepareStatement(query);
		         pstmt.setInt(1, userid);
		         pstmt.setString(2, username);
		         pstmt.setString(3, email);
		         int status = pstmt.executeUpdate();
		         if(status > 0) {
		            System.out.println("Record is inserted successfully !!!");
		         }
		      } catch(Exception e){
		         e.printStackTrace();
		      }
		   }
		   public static void input(Scanner keyboardInput) {
		      System.out.println("Enter the userid:");
		      userid = keyboardInput.nextInt();
		      System.out.println("Enter the username:");
		      username = keyboardInput.next();
		      System.out.println("Enter the email:");
		      email = keyboardInput.next();
		   
		
	}

}
