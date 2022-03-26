<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Details from Bean Class</title>
</head>
<body>
<jsp:useBean id="user" class="org.study.beans.User" scope="session"></jsp:useBean>
First Name:<jsp:getProperty property="firstName" name="user"/></br>
Last Name:<jsp:getProperty property="LastName" name="user"/>

</body>
</html>