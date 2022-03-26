package org.study.maven;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnectivity")
public class DBConnectivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	public DBConnectivity() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    String mysqlUrl = "jdbc:mysql://localhost:3306/";
	    Connection con = null;
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "Success123!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("Connection established......");
	    Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	    ResultSet rs = null;
		try {
			rs = stmt.executeQuery("Show Databases");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("List of databases: ");
	    try {
			while(rs.next()) {
			   System.out.print(rs.getInt(1));
			   System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
