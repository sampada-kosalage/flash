<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="ISO-8859-1">
 <title>Reservation/title>
</head>
<h1>Reservation Form</h1>

<body>
<form:form action="submitform"modelAttribute="reservation">
First name:<form:input path="firstname"/>
<br>
Last name:<form:input path="lastname"/>
<br/>
Gender: Male<form:radiobutton path="Gender" value="Male"/>
        Female<form:radiobutton path="Gender" value="Female"/>
       <br><br>
       
Leaving from:<form:select path="cityFrom">
<form:option value="Mumbai" label="Mumbai"/>
<form:option value="Pune" label="Pune"/>
<form:option value="Nagpur" label="Nagpur"/>
<form:option value="Delhi" label="Delhi"/>
<form:option value="Namded" label="Nanded"/>
</form:select>

<br/>

Going to:<form:select path="cityTo">
<form:option value="Mumbai" label="Mumbai"/>
<form:option value="Pune" label="Pune"/>
<form:option value="Nagpur" label="Nagpur"/>
<form:option value="Delhi" label="Delhi"/>
<form:option value="Namded" label="Nanded"/>
</form:select>
<br/>
<input type="submit" value="Submit">
<input type="cancel" value="Cancel">

</form:form>

</body>
</html>