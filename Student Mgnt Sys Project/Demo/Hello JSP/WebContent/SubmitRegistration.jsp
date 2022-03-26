<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
First Name=<%= request.getParameter("first name") %></br>
Last Name=<%= request.getParameter("last name") %></br>
User name=<%= request.getParameter("user name") %></br>
Password=<%= request.getParameter("password") %></br>
Address=<%= request.getParameter("address") %></br>
Contact Number=<%= request.getParameter("contact number") %></br>

</body>
</html>