<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/sign_up.css">
<title>Admin Login</title>
</head>
<body>
 		<nav class="fixed-nav-bar-top">
		<ul class="nav">
			<li><a href="" target="">Home</a></li>
			<li><a href="categories.jsp" target="">Categories</a></li>
			<li><a href="About Us.html" target="">About Us</a></li>
			<li><a href="ContactUs.html" target="">Contact Us</a></li>
			<li><a href="adminLogin.jsp" target="">Login</a></li>
			<li><a href="userSignup.jsp" target="">Register</a></li>
		</ul>
		</nav>
	<%
		String stat = (String)session.getAttribute("Admin");	
		if(stat != null && stat.equals("1")){
			response.sendRedirect("adminPage.jsp");
		}
		String status = request.getParameter("status");

		if(status != null && status.equals("1")){
			%>WRONG PASSWORD<%
		}else if(status != null && status.equals("2")){
			%>User Not Found!<%
		}
	%>
	<div style="
    text-align: center;">Login</div>
	<form action="login" method="GET">
	<div id="Sign-Up"> 
		<fieldset style="width:30%"  class="form-style">
	<table class="center" border="0"> <tr> 
		<td><font color=white>Username: </font><input type="text" name="username"/><br/></td>
		</tr> 
		<tr> <td><font color=white>Password:</font><input type="password" name="password"/><br/></td> </tr>
		<tr><td><input type="submit" value="login"/></td></tr>
		</table>
	</form>
</body>
</html>

