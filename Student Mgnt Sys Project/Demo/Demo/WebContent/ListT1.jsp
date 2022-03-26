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
<title>T1 List</title>
<link rel="stylesheet" href="css/table.css" type="teInterviewt/css" > 

<script>
function addT1(){
	var addT1url="AddT1.jsp?fn=Add";
	var addT1 = window.open(addT1url, "", "width=400,height=400");
}
function editT1(id){
	var addT1url="AddT1.jsp?fn=Edit&id="+id;
	var addT1 = window.open(addT1url, "", "width=400,height=400");
}
</script>
</head>

<body>
<%lookup l=lookup.getlookup();
l.optn="ListT1.jsp";
%>
<center>
T1
<form action = "AddT1" method ="post">
<table class="table1">
<tr>
<!-- HEADING  ----------->
<td class="td1">id</td>
<%//ListZ.jsp01 <td class="td1">COL</td>%>
<td class='td1'>T1C1</td>
<td class='td1'>T1C2</td>
<td class='td1'>T1C3</td>
<%=l.actionhead() %>
</tr>
<%

String sql;
String and;
String s;

try{

sql="select * from T1";
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
<td class='td1'><%=l.rs.getString("T1C1")%></td>
<td class='td1'><%=l.rs.getString("T1C2")%></td>
<td class='td1'><%=l.rs.getString("T1C3")%></td>
<%=l.editbutton("editT1("+s+")")%>
</tr>
<%}

}catch(Exception e)
{
	System.out.println(e);	
}

%>
</table>
<br/>
<%=l.addbutton("addT1()")%>

</body>
</html>
