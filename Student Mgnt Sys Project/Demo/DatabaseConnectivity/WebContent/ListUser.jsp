<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="org.study.database.User" %>
<c:import url="include/Header.jsp"><c:param name="title" value="List Users"/></c:import>
<div class="container mtb">
<div class= "col-lg-6">
<strong>Listing users</strong>
<hr/>
<table border="1">
<thead>
<th>userid</th>
<th>username</th>
<th>email</th>
</thead>

<%
List<User>listUsers=(List)request.getAttribute("ListUsers");
for(int i=0;i<listUsers.size();i++){
out.print("<tr>");
out.print("<td>"+listUsers.get(i).getusersid()+"</td>");
out.print("<td>"+listUsers.get(i).getUsername()+"</td>");
out.print("<td>"+listUsers.get(i).getemail()+"</td>");
out.print("</tr>");

updateURL=request.getContextpath()+"/operation?page=updateUser"+"&userid="+listUser.get(i).getUsers_id()+"&username"+listUsers.get(i).getUsername()+listUser.get(i).getemail();
deleteURL=request.getContextPath()+"/operation?page=deleteUser"+"&userid"+listUsers.get(i).getUserid();
out.print("<td><a href="+updateURL+">Update</a>/");

%>
<a href="<%=deleteURL %>"
onclick="if(!confirm('sure to delete the user?'))return false">Delete</a>

}

</table>
</div>
</div>
<c:import url="include/footer.jsp"></c:import>