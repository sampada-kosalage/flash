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
<title>Add T2</title>
</head>
<body>
<center>
<form  id="T2form"  onsubmit="return validate()" action = "AddT2" method ="post">
<% 	lookup l=lookup.getlookup(); 
	//<!-- INITIALISE --------------->
	String fn=request.getParameter("fn");
	String id=request.getParameter("id");
	//AddZ.jsp01 String COL="";
	String T2C1="";
	String T2C2="";
	String T2C3="";
	
	if(fn.equals("Add"))
	{
		id=String.valueOf(l.getmaxrows("T2")+1);
		
	}
	else
	{
		try
		{
			l.getrs("Select * from T2 where id="+id);
			if(l.rs!=null)
			if(l.rs.next()){
				id=l.rs.getString("id");
				//<!-- RECORD DATA ---------- -->
				//AddZ.jsp02 COL=l.rs.getString(COLNO);
				T2C1=l.rs.getString("T2C1");
				T2C2=l.rs.getString("T2C2");
				T2C3=l.rs.getString("T2C3");
			}
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}
%>
T2
<input type=hidden name=fn value=<%=fn%>>
<table>
<!-- --------INPUT TAGS ----------- -->
<tr><td>id</td><td><input type="text" name="id" value="<%=id%>"></td></tr>
<!-- <%// AddZ.jsp03 <tr><td>COL</td><td><input type="text" name="COL" value="<%=COL%>"></td></tr>   %> -->
<tr><td>T2C1</td><td><input type='text' name="T2C1" value="<%=T2C1%>"></td></tr>
<tr><td>T2C2</td><td><input type='text' name="T2C2" value="<%=T2C2%>"></td></tr>
<tr><td>T2C3</td><td><input type='text' name="T2C3" value="<%=T2C3%>"></td></tr>
<tr><td><td><input type ="submit" value="Submit"></td></tr>
</table>

</form>
</center>
</body>
</html>
