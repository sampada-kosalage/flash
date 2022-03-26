<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<%--- <jsp:useBean id="user" class="org.study.beans.User" scope="page"/>
<c:out value="${user.getFirstName}"/>
<c:out value="${user.getFirstName}"/>--%>
<%---- <c:set var="name" value="Sampada"></c:set>
${name}
<c:set remove var="name"/>
${param.msg} --%>

<%--- <c:if test="${param.name=='Sam'}">
Hello Sam
</c:if>
Hello User--%>

<%---- <c:choose>
<c:when test="${param.lang=='java'}">
</c:when>
<c:when test="${param.lang=='PHP'}">
Learning PHP
</c:when>
<c:otherwise>
Learning something randomly!
</c:otherwise>>
</c:choose>--%>

<%--- ><c:forEach var="i" begin="1" end="30" step="3">
${i} 
</br>
</c:forEach>>--%>

<%--- <a href="<c:url value="/index1.jsp">">Another Page</a>
</c:url>--%>

<%---- <c:catch var="exception">
<% int x=10/0; %>
</c:catch>
${exception}
Testing........----%>

<%----- <%
String[] names={"sam","ram","shyam"};
%>
<c:set var="namesArray"value="<%=names %>"></c:set>
${fn:length(names)}--%>

<c:set var="elements" value="${fn:split('www.google.com','.')}"></c:set>
<c:forEach var="element" items="${elememts}">
${element}
</br>
</c:forEach>
</br>
Elements:${fn:join(element,'.')}
</body>
</html>

