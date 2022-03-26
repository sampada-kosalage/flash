package onlinegroceryshopping.DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.jni.User;

public class GroceryDAO {

	private static final long serialVersionUID = 1L;
	private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "Success123!";
    java.sql.Connection conn;
    
	public String registerUser(User user) {
		getConnection();
		String sql = "INSERT INTO user (user_name, email, phone_number, password, role) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPhone_number());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, "User");
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Successfully Created ";
	}
	
	
	private void getConnection() {
        try {
        	if (conn == null) {
    			Class.forName(JDBC_DRIVER);
    			conn = DriverManager.getConnection(URL,USER,PASS);
        	}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public User getUser(String email) {
		
		getConnection();
		User user = null;
		String sql = "select * from user where email = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setUser_id(rs.getInt(1));
				user.setUser_name(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPassword(rs.getString(5));
				user.setPhone_number(rs.getString(4));
				user.setRole(rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}

