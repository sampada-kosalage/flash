<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
String userid=request.getParameter("userid");
String username=request.getParameter("username");
String email=request.getParameter("email");
try
{
 Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_db", "root", "Success123!");
           Statement st=conn.createStatement();
           int i=st.executeUpdate("insert into users(userid,username,email)values('"+userid+"','"+username+"','"+email+"')");
        out.println("Data is inserted!");
        }
        catch(Exception e)
        {
        System.out.print(e);
        e.printStackTrace();
        }
 %>
 