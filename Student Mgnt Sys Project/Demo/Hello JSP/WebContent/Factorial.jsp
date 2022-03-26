<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<font  size="6" color ="#000080">Calculate factorial Using Recursion</font>
<br>
<%
int num=Integer.parseInt(request.getParameter("num"));
%>
 <%!
    int factorial(int n)
    {
        if (n == 1) {
            return n;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    %>
       <%
        out.println("The factorial of  " +num+"  is : " + factorial(num));
    %>
</body>
</html>