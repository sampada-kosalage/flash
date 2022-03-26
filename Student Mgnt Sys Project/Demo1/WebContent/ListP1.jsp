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
<title>P1 List</title>
<link rel="stylesheet" href="css/table.css" type="teInterviewt/css" > 

<script>
function addP1(){
	var addP1url="AddP1.jsp?fn=Add";
	var addP1 = window.open(addP1url, "", "width=400,height=400");
}
function editP1(id){
	var addP1url="AddP1.jsp?fn=Edit&id="+id;
	var addP1 = window.open(addP1url, "", "width=400,height=400");
}
function addchildC1(id){
	var addC1url="AddC1.jsp?fn=Add&id="+id;
	var addC1 = window.open(addC1url, "", "width=400,height=400");
}
function listchildC1(id){
	var listC1url="ListC1.jsp?fn=List&id="+id;
	var listC1 = window.open(listC1url, "", "width=400,height=400");
}
</script>
</head>

<body>
<%lookup l=lookup.getlookup();
l.optn="ListP1.jsp";
%>
<center>
P1
<form action = "AddP1" method ="post">
<table class="table1">
<tr>
<!-- HEADING  ----------->
<td class="td1">id</td>
<!-- <%//ListZ.jsp01 <td class="td1">COL</td>%> -->
<td class='td1'>P1C1</td>
<td class='td1'>P1C2</td>
<td class='td1'>P1C3</td>
<%=l.actionhead() %>
</tr>
<%

String sql;
String and;
String s;

try{

sql="select * from P1";
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
<td class='td1'><%=l.rs.getString("P1C1")%></td>
<td class='td1'><%=l.rs.getString("P1C2")%></td>
<td class='td1'><%=l.rs.getString("P1C3")%></td>
<%=l.editbutton("editP1("+s+")")%>
<%=l.addchildbutton("addchildC1("+s+")")%>
<%=l.listchildbutton("listchildC1("+s+")")%>
</tr>
<%}

}catch(Exception e)
{
	System.out.println(e);	
}

%>
</table>
<br/>
<%=l.addbutton("addP1()")%>

</body>
</html>
