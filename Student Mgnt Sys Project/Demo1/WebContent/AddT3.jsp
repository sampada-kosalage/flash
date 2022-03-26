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
<script type="text/javascript" src="js/validate.js"></script>
<title>Add T3</title>
</head>
<body>
<center>
<form  id="T3form"  onsubmit="return validate()" action = "AddT3" method ="post">
<% 	lookup l=lookup.getlookup(); 
	//<!-- INITIALISE --------------->
	String fn=request.getParameter("fn");
	String id=request.getParameter("id");
	//AddZ.jsp01 String COL="";
	String T3C1="";
	String T3C2="";
	String T3C3="";
	
	if(fn.equals("Add"))
	{
		id=String.valueOf(l.getmaxrows("T3")+1);
		
	}
	else
	{
		try
		{
			l.getrs("Select * from T3 where id="+id);
			if(l.rs!=null)
			if(l.rs.next()){
				id=l.rs.getString("id");
				//<!-- RECORD DATA ---------- -->
				//AddZ.jsp02 COL=l.rs.getString(COLNO);
				T3C1=l.rs.getString("T3C1");
				T3C2=l.rs.getString("T3C2");
				T3C3=l.rs.getString("T3C3");
			}
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}
%>
T3
<input type=hidden name=fn value=<%=fn%>>
<table>
<!-- --------INPUT TAGS ----------- -->
<tr><td>id</td><td><input type="text" name="id" value="<%=id%>"></td></tr>
<!-- <%// AddZ.jsp03 <tr><td>COL</td><td><input type="text" name="COL" value="<%=COL%>"></td></tr>   %> -->
<tr><td>T3C1</td><td><input type='text' name="T3C1" value="<%=T3C1%>"></td></tr>
<tr><td>T3C2</td><td><input type='text' name="T3C2" value="<%=T3C2%>"></td></tr>
<tr><td>T3C3</td><td><input type='text' name="T3C3" value="<%=T3C3%>"></td></tr>
<tr><td><td><input type ="submit" value="Submit"></td></tr>
</table>

</form>
</center>
</body>
</html>
