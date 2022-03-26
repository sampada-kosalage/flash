<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gray">
	<form action="Updateuser" method="get">
		<font color="brown" />
		<h1 align="center">ENTER THE DETAILS</h1>

		<div align="center">
			Enter id<br> <input type="text" name="id"><br>
			Enter new Name<br> <input type="text" name="name"><br>
			Enter new password<br> <input type="text" name="password"><br>
		    Enter new email<br> <input type="text" name="email"><br>
		    Enter new country<br> <input type="text" name="country"><br>
			
			<br> <input type="submit" value="Update Name and country in DB">
		</div>
	</form>

</body>
</html>