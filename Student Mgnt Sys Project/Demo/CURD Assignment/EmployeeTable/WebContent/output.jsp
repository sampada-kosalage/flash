<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="beige">

<%
int i = 0;
user u=(user)request.getAttribute("user");
%>
	<h1> The user details with id: <%=u.getid() %></h1><br>
	<h2> Name: <%=u.getName() %></h2><br>
	<h2> City: <%=u.getcountry() %></h2>
	
</body>
</html>