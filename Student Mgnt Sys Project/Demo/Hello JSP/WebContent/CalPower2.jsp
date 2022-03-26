<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Power</title>
</head>
<body>
<center>
<table border="2" align="center">
     <th>Exponent</th>
     <th>2^Exponent</th>
     <% for (int i=0; i<=10; i++) { %>
            <tr>
                <td><%= i%></td>
                <td>
                <%= Math.pow(2, i) %>
                </td>
            </tr>
     <% }  %>
</table>
</center>
</center>
</body>
</html>