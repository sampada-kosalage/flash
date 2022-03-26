<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#00FFFF">
  <form action="Servlet" method="post">
    <h1 align="center">Add user</h1>
    <h1>
      <a href="index.jsp">List user</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <td>firstname</td>
        <td><input type="text" name="firstname"></td>
      </tr>
      <tr>
        <td>lastname</td>
        <td><input type="text" name="lastname"></td>
      </tr>
      <tr>
        <td>email</td>
        <td><input type="text" name="email"></td>
      </tr>
      <tr>
        <td>username</td>
        <td><input type="text" name="username"></td>
      </tr>
      <tr>
        <td>city</td>
        <label for="Status">City:</label>
            <select name="Status" id="Status"></select>
            <option value="pune">Pune</option>
            <option value="mumbai">Mumbai</option>
            <option value="nagpur">Nagpur</option>
            <option value="nagar">Nagar</option>
      </tr>
      <tr>
      <tr>
        <td>phonenumber</td>
        <td><input type="number" name="phonenumber"></td>
      </tr>
      <tr>
      <tr>
        <td>gender</td>
         Gender: Male<form:radiobutton path="Gender" value="Male"/>
            Female<form:radiobutton path="Gender" value="Female"/>
            <br><br>
      </tr>
      <tr>
      <tr>
        <td>password</td>
        <td><input type="password" name="password"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" name="Action" value="add user"></td>
      </tr>
    </table>
  </form>
</body>
</html>
