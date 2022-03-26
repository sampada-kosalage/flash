<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Area of Circle</title>
</head>
<body>
<%!
     String value;
     double result;
%>

<%
     value  = request.getParameter("data");
     result = Double.parseDouble(value);
%>

<jsp:useBean id="circle" class="org.study.beans.Circle" scope="page" />
<jsp:setProperty name="circle" property="radius" value="<%= result %>" />       
<b>RADIUS: </b> 
<jsp:getProperty name="circle" property="radius" />
<br><br>
<b>AREA </b> 
<jsp:getProperty name="circle" property="area" />

</body>
</html>