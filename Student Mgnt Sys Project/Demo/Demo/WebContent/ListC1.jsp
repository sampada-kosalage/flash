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
<title>C1 List</title>
<link rel="stylesheet" href="css/table.css" type="teInterviewt/css" > 

<script>
function addC1(id){
	var addC1url="AddC1.jsp?fn=Add&id="+id;
	var addC1 = window.open(addC1url, "", "width=400,height=400");
}
function editC1(id){
	var addC1url="AddC1.jsp?fn=Edit&id="+id;
	var addC1 = window.open(addC1url, "", "width=400,height=400");
}
</script>
</head>

<body>
<%lookup l=lookup.getlookup();
l.optn="ListC1.jsp";
String fn=request.getParameter("fn");
String C1P1id=request.getParameter("id");
%>
<center>
C1
<form action = "AddC1" method ="post">
<table class="table1">
<tr>
<!-- HEADING  ----------->
<td class="td1">id</td>
<!-- <%//ListZ.jsp01 <td class="td1">COL</td>%> -->
<td class='td1'>C1P1id</td>
<td class='td1'>C1C2</td>
<td class='td1'>C1C3</td>
<%=l.actionhead() %>
</tr>
<%

String sql;
String and;
String s;

try{
if(C1P1id =="")
	sql="select * from C1";
else
	sql="select * from C1 where C1P1id="+C1P1id;
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
<td class='td1'><%=l.rs.getString("C1P1id")%></td>
<td class='td1'><%=l.rs.getString("C1C2")%></td>
<td class='td1'><%=l.rs.getString("C1C3")%></td>
<%=l.editbutton("editC1("+s+")")%>
<td class='td1'><%=l.addbutton("addC1("+l.rs.getString("C1P1id")+")")%></td>
</tr>
<%}

}catch(Exception e)
{
	System.out.println(e);	
}

%>
</table>
<br/>
<%=l.addbutton("addC1()")%>

</body>
</html>
