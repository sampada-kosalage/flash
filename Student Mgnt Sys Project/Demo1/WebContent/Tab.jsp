<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="lookup.lookup"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/tab.css" type="text/css" >
<script type="text/javascript" src="js/tab.js"></script>  
</head>
<body>
<%lookup l=lookup.getlookup();
l.tab="Tab";
%>
<div id=tab class="tab">
<%// <!-- TabZ.jsp01   <button class="tablinks" onclick="openTab(event, '$EVENT')"> $FUNCTION</button> --> %>
</div>

<%// <!-- TabZ.jsp02 <div id="$EVENT" class="tabcontent"><jsp:include page="$LINK" /> </div> --> %>

</body>
</html>