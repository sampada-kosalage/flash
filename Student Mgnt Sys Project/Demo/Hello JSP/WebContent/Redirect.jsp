<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Redirect </title>
</head>
<body>
 <%
  String redirectURL = "http://www.javatips.net/";
   response.sendRedirect(redirectURL);
    %>
</body>
</html>