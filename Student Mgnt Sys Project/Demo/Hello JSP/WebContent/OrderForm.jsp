<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Sample Order Form</title>
</head>
<body>
<form>
      <table border="1">
        <tr>
          <th>Item</th>
          <th>Price</th>
          <th>Quantity</th>
          <th>Total Price</th>
        </tr>

        <tr>
        <td width="80">Mobile</td>
          <td><input type="text" id="QtyA" size="5" onchange "calc()"></td>
          <td>€3.00</td>
          <td>
            <input type="text" id="TotalA" size="12" onchange "calc()">
          </td>
        </tr>
</body>
</html>