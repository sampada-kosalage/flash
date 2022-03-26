package org.study.beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse;

/*import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletResponse;*/

public class Demo extends HttpServlet{

private static final long serialVarsionUID=1L;
@javax.annotation.Resource(name="jdbc/project")
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
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String mysqlUrl = "jdbc:mysql://localhost:3306/study_db?useSSL=FALSE";
    Connection con = null;
	try {
		con = DriverManager.getConnection(mysqlUrl, "root", "Success123!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Connection established......");
    Statement stmt = null;
	try {
		stmt = con.createStatement();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    ResultSet rs = null;
	try {
		rs = stmt.executeQuery("Show Databases");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("List of databases: ");
    try {
		while(rs.next()) {
		   System.out.print(rs.getString(1));
		   System.out.println();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


	


