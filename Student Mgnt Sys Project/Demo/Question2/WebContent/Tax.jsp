<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "Tax.ComputeTax" %> <% double taxInc = Double.parseDouble(request.getParameter("taxInc")); int status = Integer.parseInt(request.getParameter("status")); %> Taxable Income: <%= taxInc %>
Status: <%= status %>
Total Payment: <%= ComputeTax.computeTax(status,taxInc) %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

</body>
</html>