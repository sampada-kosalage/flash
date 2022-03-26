package org.study.beans;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class UserModel {

	public List<User>listUsers(DataSource datasource){
	List<User> listUsers=new ArrayList<>();
	Connection connect=null;
	Statement stmt=null;
	ResultSet rs=null;
	try {
		connect=datasource.getConnection();
		
		String query="Select * from users";
		stmt=connect.createStatement();
		
		rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			//out.print(rs.getString("email"));
			listUsers.add(new User(rs.getInt("userid"),rs.getString("username"),rs.getString("email")));
		}
	}catch(SQLException e) {
			e.printStackTrace();
		}
	return listUsers;
}
}
