<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta http-equiv="Context-type" context="text/html; charset-ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/files/css/style.css"/>
</head>
<body>
     <h4>Home Page:List of users in the project</h4>
     <hr/>
     <table border="1" align="left">
     <tr>
          <th>User ID</th>
          <th>Name</th>
          <th>Email</th>
          
     </tr>
     <c:forEach items="${users}" var="users">
     <tr>
       <td>${user.userID}</td>
       <td>${user.name}</td>
       <td>${user.email}</td>
       </tr>
       </c:forEach>
       </table>
       
</body>
</html>