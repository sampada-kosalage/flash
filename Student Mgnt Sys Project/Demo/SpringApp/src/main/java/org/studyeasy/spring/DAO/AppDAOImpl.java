package org.studyeasy.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.catalina.User;

public class AppDAOImpl implements AppDAO{
	
	private DataSource datasource;
	
	public void AppDAOImple(DataSource datasource) {
		this.datasource=datasource;
	}
	
	public List<User>ListUser(){
		String SQL="Select * from users";
		List<User> listUsers=new ArrayList<User>();
		Connection conn=null;
		
		try {	
			conn=datasource.getConnection();
			PreparedStatement ps=conn.prepareStatement(SQL);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	User temp=new User(
		    			rs.getInt("user_id"),
		    			rs.getInt("name"),
		    			rs.getInt("email"));
		    	listUsers.add(temp);
		    }
		    rs.close();
		    ps.close();
		    return listUsers;
		    
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

  @Override
	public List<User> listUsers()
     {
		return null;
	 }

}

