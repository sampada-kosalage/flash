<%@ page language = "java" contentType = 
  "text/html; charset = ISO-8859-1"
  import = "java.io.*"
  import = "java.sql.*"
  import = "java.util.*"
  import = "javax.sql.*"
  import = "java.sql.ResultSet"
  import = "java.sql.Statement"
  import = "java.sql.Connection"
  import = "java.sql.DriverManager"
  import = "java.sql.SQLException"
%>
<%
  Connection con = null;  
  PreparedStatement ps = null;
  ResultSet rs = null;
  Statement stmt = null;
  String name = request.getParameter("name");
  Integer id = 5;
  String email;
%>
<html>
<head>
  <title>Update Database</title>
</head>
<body>
<%
  try {
  Class.forName("com.mysql.jdbc.Driver");
  con =DriverManager.getConnection 
  ("jdbc:mysql://localhost:3306/","root", "Success123!");
  ps = con.prepareStatement("update servlet set name = ? where id = ?");
  ps.setInt(2, id);
  ps.setString(1, name);
  ps.setString(3,email);
  ps.executeUpdate();
  %>
  Database successfully Updated!<br>
  <%
  if(ps.executeUpdate()>=1){
  stmt=con.createStatement();
  rs = stmt.executeQuery("SELECT * FROM users");
  while(rs.next()){
  %>
  <%=rs.getObject(1).toString()%>
  <%=("\t\t\t")%>
  <%=rs.getObject(2).toString()%>
  <%=("<br>")%>
  <%
  }
  }

  } catch (IOException e) {
  throw new IOException("Can not display records.", e);
  } catch (ClassNotFoundException e) {
  throw new SQLException("JDBC Driver not found.", e);
  } finally {
  try {
  if(stmt != null){
  stmt.close();
  stmt = null;
  }
  if(ps != null) {
  ps.close();
  ps = null;
  }
  if(con != null) {
  con.close();
  con = null;
  }
  } catch (SQLException e) {}
  }
%>
</body>
</html>