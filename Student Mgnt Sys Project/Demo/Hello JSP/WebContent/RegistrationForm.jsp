<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form action=submit.jsp method="post">
<table style="width:50%">
<tr><td>FirstName</td>
<td><input type="text"name="firstname"/></td>
</tr>
<tr><td>LastName</td>
<td><input type="text"name="lastname"/></td>
</tr>
<tr><td>UserName</td>
<td><input type="text"name="username"/></td>
</tr>
<tr><td>Password</td>
<td><input type="text"name="password"/></td>
</tr>
<tr><td>Address</td>
<td><input type="text"name="address"/></td>
</tr>
<tr><td>ContactNumber</td>
<td><input type="text"name="contactnumber"/></td>
</tr>
</table>
<input type="submit" value="submit"/>

</form>
</body>
</html>