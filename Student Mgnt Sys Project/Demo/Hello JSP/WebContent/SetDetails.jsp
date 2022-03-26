<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Details</title>
</head>
<body>
<jsp:useBean id="user" class=org.study.beans.User scope="session"></jsp:useBean>
<form action=:GetDetails.jsp: method="post">
<input type="text" name="fistName" value='<jsp:setProperty property="firstName" name="User"/>'></br>
<input type="text" name="lastName" value='<jsp:setProperty property="lastName" name="User"/>'></br>
<input type"submit" value"submit">

/*<jsp:setProperty property="firstName" name="User" value="Sam"/></br>
<jsp:setProperty property="LastName" name="User" value="Rahul"/></br>
Value have been set*/
</body>
</html>