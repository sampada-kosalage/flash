<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="lookup.lookup"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title>U1</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/tab.css" type="text/css" >
<script type="text/javascript" src="js/tab.js"></script>  
</head>
<body>
<%lookup l=lookup.getlookup();
l.tab="TabU1";
%>
<div id=tab class="tab">
<%// <!-- TabZ.jsp01   <button class="tablinks" onclick="openTab(event, '$EVENT')"> $FUNCTION</button> --> %>
   <button class="tablinks" onclick="openTab(event, 'U1F1')">U1F1</button>
   <button class="tablinks" onclick="openTab(event, 'U1F2')">U1F2</button>
   <button class="tablinks" onclick="openTab(event, 'U1F3')">U1F3</button>
</div>

<%// <!-- TabZ.jsp02 <div id="$EVENT" class="tabcontent"><jsp:include page="$LINK" /> </div> --> %>
 <div id="U1F1" class="tabcontent"><jsp:include page="ListT1.jsp" /> </div>
 <div id="U1F2" class="tabcontent"><jsp:include page="ListT2.jsp" /> </div>
 <div id="U1F3" class="tabcontent"><jsp:include page="ListT3.jsp" /> </div>

</body>
</html>