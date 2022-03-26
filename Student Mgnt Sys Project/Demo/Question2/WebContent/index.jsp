<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter the details</h1>
		<form action="TaxController" method="get">
		Net Income: <br> <input type="text" name="income"><br>
		Filing Status: <br><select name="status">
			<option value="Single">Single</option>
			<option value="Married Jointly">Married Jointly</option>
			<option value="Married Separately">Married Separately</option>
			<option value="Head of Household">Head of Household</option>	
		</select>
		<br/> <br/><input type="submit" value="Calculate Tax">
         <input type="reset" value="reset">
		</form>

</body>
</html>