package org.study.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.catalina.User;

import com.mysql.cj.xdevapi.PreparableStatement;

public class UserModel {

	public  List<User> UserModel(DataSource datasource){
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
public void addUser(DataSource dataSource,User newUser) {
	Connection connect=null;
	PreparableStatement stament=null;
	try {
		connect=dataSource.getConnection();
		String usernane=newUser.getUsername();
		//String email=newUser.getemail();
		String query="insert into users(username,email values(?,?))";
		PreparedStatement statement = connect.prepareStatement(query);
		statement.setString(1,usernane);
		//statement.setString(2,email);
        statement.execute();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
public void updateUser(DataSource dataSource,User updatedUser) {
	Connection connect=null;
	PreparableStatement stament=null;
	try {
		connect=dataSource.getConnection();
		String userid=updatedUser.getUsername();
		String username=updatedUser.getName();
		//String email=updatedUser.getemail();

		String query="update users set username=?,email=?,where usersid=?";
		PreparedStatement statement = connect.prepareStatement(query);
		statement.setString(1,username);
		//statement.setString(2,email);
		statement.setString(3,userid);

        statement.execute();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
public void deleteUser(DataSource dataSource,String userID) {
	Connection connect=null;
	PreparedStatement statment=null;
	try {
		connect=dataSource.getConnection();
	
		String query="delete from users where usersid=1";
		PreparedStatement statement = connect.prepareStatement(query);
		statement.setString(1,userID);
		statement.execute();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
public List<org.study.database.User> listUsers(DataSource dataSource) {
	return null;
}
}
