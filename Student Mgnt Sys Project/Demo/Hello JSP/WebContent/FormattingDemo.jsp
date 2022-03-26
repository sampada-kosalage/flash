<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ tablib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="d" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Demo</title>
</head>
<body>
 <c:set var="date"value="<%=new java.util.Date() %>"/>
 <c:out value="${date}"></c:out>
 <br/>Time:<strong><fmt:formatDate type="time" value="${date}"/></strong>
 <br/>date:<strong><fmt:formatDate type="time" value="${date}"/></strong>

<br/>Date and Time:<strong><fmt:formatDate type="both" value="${date}"/></strong>>
<br/>
<fmt:setLocal value="en_UK"/>
<br/>Date and Time:<strong><fmt:formatDate type="both" value="${date}" timeZone="Gm"/></strong>>


<%--- <c:set var="someNNumber" value="657847.12345"/>
<b><c:out value="${someNumber}"></c:out>
</b>
Max Integer Digits:<fmt:formatNumber type="number" maxIntegerDigits="3" value="${someNumber}"></fmt:formatNumber>
<br/>
Max Fraction Digits:<fmt:formatNumber type="number" maxFractionDigits="3" value="${someNumber}"></fmt:formatNumber>
<br/>
<fmt:setLocal value="en_US"/>
Currency:<fmt:formatNumber value="${someNumber}" type="currency"/>--%>


<c:demo parameter="10000"></c:demo>
</body>
</html>