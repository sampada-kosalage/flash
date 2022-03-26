<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="lookup.lookup" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/botstrap/3.4.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com.ajax.libs/jequery/3.4.1/jquery.min.js"></script>
<script src="https:maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>T3 List</title>
<link rel="stylesheet" href="css/table.css" type="teInterviewt/css" > 

<script>
function addT3(){
	var addT3url="AddT3.jsp?fn=Add";
	var addT3 = window.open(addT3url, "", "width=400,height=400");
}
function editT3(id){
	var addT3url="AddT3.jsp?fn=Edit&id="+id;
	var addT3 = window.open(addT3url, "", "width=400,height=400");
}
</script>
</head>

<body>
<%lookup l=lookup.getlookup();
l.optn="ListT3.jsp";
%>
<center>
T3
<form action = "AddT3" method ="post">
<table class="table1">
<tr>
<!-- HEADING  ----------->
<td class="td1">id</td>
<%//ListZ.jsp01 <td class="td1">COL</td>%>
<td class='td1'>T3C1</td>
<td class='td1'>T3C2</td>
<td class='td1'>T3C3</td>
<%=l.actionhead() %>
</tr>
<%

String sql;
String and;
String s;

try{

sql="select * from T3";
and="";
// FILTER  ----------->
sql=sql+" order by 1";
l.getrs1(sql);
while (l.rs.next()) {
s=l.rs.getString("id");
%>
<tr>
<!-- COLUM VALUES  ----------->
<td class="td1"><%=s%></td>
<!-- <%// ListZ.jsp02 <td class="td1"><%=l.rs.getString(COLNO)%></td>  %>  -->
<td class='td1'><%=l.rs.getString("T3C1")%></td>
<td class='td1'><%=l.rs.getString("T3C2")%></td>
<td class='td1'><%=l.rs.getString("T3C3")%></td>
<%=l.editbutton("editT3("+s+")")%>
</tr>
<%}

}catch(Exception e)
{
	System.out.println(e);	
}

%>
</table>
<br/>
<%=l.addbutton("addT3()")%>

</body>
</html>
