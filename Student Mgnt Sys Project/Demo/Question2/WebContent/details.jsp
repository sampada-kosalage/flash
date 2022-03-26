<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="azure">
	<div align="center">
		<%
		double tax = (Double) request.getAttribute("tax");
		ComputeTax ct = (ComputeTax) request.getAttribute("compute");
		%>
		<h1>The calculated tax as per your selection is</h1>
		<br>
		<h2>
			Income:
			<%=ct.getTaxableincome()%></h2>
		<h2>
			Filing Status:
			<%=ct.getFillingstatus()%></h2>
		<h2>
			Total Tax to be paid:
			<%=tax%></h2>
		<br>
		<h3>
			<a href="index.jsp">Click here to calculate again</a>
		</h3>
	</div>
</body>
</html>