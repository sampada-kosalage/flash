<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action=submit.jsp method="post">
Full name<input type="text name="name"/></br>
Gender:<input type="radio" name="gender value "female" checked="checked">Female</br>
       <input type="radio" name="gender value "male">male</br>
Language know<input type ="checkbox name=language"value="English">English
             <input type ="checkbox name=language"value="Hindi">Hindi
              <input type ="checkbox name=language"value="Marathi">Marathi</br>
              
Country<select name="country">
       <option value="India">India</option>
       <option value="USA">India</V>
       <option value="japan">japan</option>
       <option value="Uk">Uk</option>
       </select></br>
       <input type"submit" value="submit">
                     

</form>

</body>
</html>