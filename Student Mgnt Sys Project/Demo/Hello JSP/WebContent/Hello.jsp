<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
//<h1>Hello JSP</h1>
<%="Welcome to jsp" %>
<br/>
Current Time:<%=java.util.Calendar.getInstance().getTime() %>
<br/>
<%=25>4 %>
<%
int x=25;
out.println(x);
if(x>25){
	out.println("x is greater");
}else{
	out.println("x is smaller");
}
%>
</br>
<%!
int cube(int n){
	return n*n*n;
}
%>
<%="Cube of 3 is:"+cube(3) %>
</br>
<%int data=50;
%>
<%="Value of the variable is:"+data %>
</br>
<%
int x1=52;
out.print("value of x1 is");
out.print(x);
%>
</br>

</br>
<%
out.print("Value 1:"+request.getParameter("getValue1"));
out.print("Value 2:"+request.getParameter("getValue2"));

%>
</br>
<% include file="file1.txt";%>
</br>
<jsp:include page="file2.txt"/>
</br>
<% out.print(new java.util.Data()); %>
</br>
<% page import="java.util.Date";%>
<% new Date(); %>
</br>
<% page import= "org.studyjava.UserDefined"; %>
<% out.print(new UserDefined().Demo()); %>>

</body>
</html>