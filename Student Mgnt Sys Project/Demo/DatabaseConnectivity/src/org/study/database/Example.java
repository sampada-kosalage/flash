package org.study.database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jdi.connect.spi.Connection;

public class Example extends HttpServlet{

	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
     {  
        PrintWriter out = res.getWriter();  
        res.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Success123!");  
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from users");  
            out.println("<table border=1 width=50% height=50%>");  
            out.println("<tr><th>userid</th><th>username</th><th>email</th><tr>");  
            while (rs.next()) 
            {  
                int n = rs.getInt("userid");  
                String nm = rs.getString("username");  
                String s = rs.getString("email");   
                out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
    }  
}  

