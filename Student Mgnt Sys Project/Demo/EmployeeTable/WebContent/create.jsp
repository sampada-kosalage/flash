<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<form action="Saveuser" method="get">
	<font color="brown" />
	<h1 align="center">ENTER THE DETAILS</h1>

	<div align="center">
		Enter id<br> <input type="text" name="id"><br>
		Enter Name<br> <input type="text" name="name"><br>
	    Enter password<br> <input type="text" name="password"><br>
		
		Enter email<br> <input type="text" name="email"><br>
		Enter country<br> <input type="text" name="country"><br>
		
		<br> <input type="submit" value="Save in DB">
	</div>
</form>
</body>
</html>