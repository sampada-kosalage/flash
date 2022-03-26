package org.study.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateRecord extends HttpServlet{


		public void doGet(HttpServletRequest request,HttpServletResponse response)
				throws ServletException,IOException
			{
			String name=request.getParameter("userid");
			String name1=request.getParameter("username");
			String password=request.getParameter("email");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();

			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/","root","Success123!");
			PreparedStatement stmt=con.prepareStatement
				("update users userid=?,username=?");
			String userid = null;
			stmt.setString(1, userid);
			String username = null;
			stmt.setString(2, username);
			String email = null;
			stmt.setString(3, email);

			stmt.executeUpdate();
			if(true)
			out.println("<b>You are successfully update</b>");
			con.close();
			}
			catch(Exception e)
			{
			out.println("<b> failed</b>");
			out.println("<b>Error:</b>" +e);
			}
	}

}
