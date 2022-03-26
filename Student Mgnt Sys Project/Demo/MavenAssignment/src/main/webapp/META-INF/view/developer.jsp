<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Developer database</title>
</head>
<body>
<h1>Developer</h1>
<table>
  <tr>
    <th>Name</th>
    <th>Skill</th>
    <th></th>
  </tr>
  <tr=th:each="developer:${developers}">
       <td the:text="${developer.firstName+' '+developer.lastName}"></td>
       <td><span th:each="skill,iterStat:${developer.skills}">
           <span th:text="${skill.label}">
           <th:block th:if="${!iterStat.last}">,</th:block>
           </span>
           <td><a the:href="@{/developer/{id}(id=${developer.id})}">view</a>
           </td>
     </tr>
</table>
<hr/>
<form th:action="@{/developers}"method="post" enctype="multipart/form-data">
    <div>First name:<input name="firstName"/></div>
     <div>Last name:<input name="lastName"/></div>
      <div>Email:<input name="email"/></div>
      <div><input type="submit" value="Create Developer" name="button"/>
      </div>
      </form>
     

</body>
</html>