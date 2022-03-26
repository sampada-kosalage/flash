import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.study.databse.EmpDao;

import com.mysql.cj.jdbc.JdbcConnection;

public class UserDao {

	public boolean registerUser(User user) throws ClassNotFoundException {
        String SQL = "INSERT INTO user" +"(firstname, lastname,email,username,city,phonenumber,gender,password) VALUES "+"(?, ?, ?, ?,?,?,?,?)";
        int i=0;

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Success123!");

       PreparedStatement preparedStatement =  connection.prepareStatement(SQL)) { 
         
        preparedStatement.setString(1,user.getFirstname());
        preparedStatement.setString(2,user.getLastname());
        preparedStatement.setString(3,user.getEmail());
        preparedStatement.setString(4,user.getUsername());
        preparedStatement.setString(5,user.getCity());
        preparedStatement.setString(6,user.getPhonenumber());
        preparedStatement.setString(7,user.getGender());
        preparedStatement.setString(8,user.getPassword());

        i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        if (i == 0) {
          return false;
        } else {
          return true;
        }
      }
	public boolean editUser(User user) {
	    Connection connection = JdbcConnection.getConn();	            

	    String sql = "update user set email=?, city=?, lastname=?";
	    sql += " where firstname=? ";
	    int i = 0;
	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(sql);
	        preparedStatement.setString(1,user.getFirstname());
	        preparedStatement.setString(2,user.getLastname());
	        preparedStatement.setString(3,user.getEmail());
	        preparedStatement.setString(4,user.getUsername());
	        preparedStatement.setString(5,user.getCity());
	        preparedStatement.setString(6,user.getPhonenumber());
	        preparedStatement.setString(7,user.getGender());
	        preparedStatement.setString(8,user.getPassword());

	    i = preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	    if (i == 0) {
	      return false;
	    } else {
	      return true;
	    }
	  }
	public void deleteUser(String username) {
	    Connection connection = JdbcConnection.getConn();
	    String sql = "delete from user where username=?";
	    try {
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);
	      ((Object) preparedStatement).setusername(1, username);
	      preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	    	 e.printStackTrace();
	    }
}
}

