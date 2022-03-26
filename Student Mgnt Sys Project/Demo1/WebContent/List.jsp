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
<title> List</title>
<link rel="stylesheet" href="css/table.css" type="teInterviewt/css" > 

<script>
function add(){
	var addurl="Add.jsp?fn=Add";
	var add = window.open(addurl, "", "width=400,height=400");
}
function edit(id){
	var addurl="Add.jsp?fn=Edit&id="+id;
	var add = window.open(addurl, "", "width=400,height=400");
}
</script>
</head>

<body>
<%lookup l=lookup.getlookup();
l.optn="List.jsp";
%>
<center>

<form action = "Add" method ="post">
<table class="table1">
<tr>
<!-- HEADING  ----------->
<td class="td1">id</td>
<%//ListZ.jsp01 <td class="td1">COL</td>%>
<%=l.actionhead() %>
</tr>
<%

String sql;
String and;
String s;

try{

sql="select * from ";
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
<%=l.editbutton("edit("+s+")")%>
</tr>
<%}

}catch(Exception e)
{
	System.out.println(e);	
}

%>
</table>
<br/>
<%=l.addbutton("add()")%>

</body>
</html>
