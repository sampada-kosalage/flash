<%@page import="java.sql.*" %>
<%
 
    if(request.getParameter("submit")!=null)
    {
        String userid = request.getParameter("userid");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Success123!");
        pst = con.prepareStatement("insert into records(userid,username,email)values(?,?,?)");
        pst.setString(1, userid);
        pst.setString(2, username);
        pst.setString(3, email);
        pst.executeUpdate();  
     %>
    <script>  
        alert("Record Added");    
    </script>
    <%       
     }
   %>
   <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>CURD Display</h1>
        </br>
        <div class="row">
            <div class="col-sm-4">
                <form  method="POST" action="#" >
                    
                    <div alight="left">
                        <label class="form-label">userid</label>
                        <input type="text" class="form-control" placeholder="username" name="uid" id="uid" required >
                     </div>
                        
                    <div alight="left">
                        <label class="form-label">username</label>
                        <input type="text" class="form-control" placeholder="username" name="username" id="username" required >
                     </div>
                      <div alight="left">
                        <label class="form-label">email</label>
                        <input type="text" class="form-control" placeholder="email" name="email" id="email" required >
                     </div>
                         </br>
                        
                     <div alight="right">
                         <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                         <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
                     </div>  
                        
                </form>
            </div>
            
             <div class="col-sm-8">
                 <div class="panel-body">
                     <table id="tbl-study_db" class="table table-responsive table-bordered" cellpadding ="0" width="100%">
                         <thead>
                             <tr>
                                    <th>userid</th>
                                    <th>username</th>
                                    <th>email</th>
                                    <th>Update</th>
                                    <th>Delete</th>
                             </tr>  
                             <%  
 
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
        
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Success123!");
                                
                                  String query = "select * from users";
                                  Statement st = con.createStatement();
                                      rs =  st.executeQuery(query);
                                    
                                        while(rs.next())
                                        {
                                            String id = rs.getString("id");
                                   %>
            
                             <tr>
                                 <td><%=rs.getString("userid") %></td>
                                 <td><%=rs.getString("username") %></td>
                                 <td><%=rs.getString("email") %></td>
                                 <td><a href="update.jsp?id=<%=id%>">Update</a></td>
                                 <td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
                             </tr>
                              <%
                                
                                 }
                               %>
                            
      </table>    
     </div>
 </div>  
 </div>
 
</body>
</html>