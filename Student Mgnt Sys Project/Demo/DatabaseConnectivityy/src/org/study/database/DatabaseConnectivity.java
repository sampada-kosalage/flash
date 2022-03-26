package org.study.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;
public class DatabaseConnectivity extends HttpServlet{

	@Resource(name="jdbc/project")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		/*PrintWriter out=response.getWriter();
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			connect=dataSource.getConnection();
			
			String query="Select*from users";
			stmt=connect.createStatement();
			
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				out.print(rs.getString("email"));
				
			}
		}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	}*/
		
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
