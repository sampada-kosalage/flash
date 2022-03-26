<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successs</title>
</head>
<body>
<p>You are Successfully logged in!</p>
<%
LoginBean bean=(LoginBean)request.getAttribute("bean");
out.print("Welcome,"+bean.getName());
%>

<%
String username=null,sessionID=null;
Cookie[] cookies=request.getCookies();
if(cookies!=null){
	for(Cookie:cookie){
	if(cookies.getName.equals("username")){	
    username=cookies.getValue();
}
if(cookies.getName().equals(JESSIONID)){
	sessionID=cookies.getValue();
}
	}
}
if(seesionID==null||username==null){
	response.sendRedirect("index.jsp");
}
%>
Name:<%=username %></br>
Current session:<%=sessionID %></br>
<form action="<%=request.getContextPath() %>>/LoginController" method="get">
<input type="hidden" name="action">
<input type="submit" value"log out">
</form>
</body>
</html>