<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTTP Headers</title>
</head>
<body>
<p>HTTP headers:</p>
    <ol>
      <c:forEach var="nextHeader" items="${header}">
      <li><c:out value="${nextHeader.key}" /> = <c:out value="${nextHeader.value}"/></li>
      </c:forEach>
    </ol>
</body>
</html>