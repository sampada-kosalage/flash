<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum of two number</title>
</head>
<body>
Sum of number
<% int x,y;
x=Integer.parseInt(request.getParameter("no1"));
y=Integer.parseInt(request.getParameter("no2"));
out.print(x+y);
%>
</body>
</html>