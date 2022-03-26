package onlinegroceryshopping.model;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteItem")
public class DeleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "Success123!";
    java.sql.Connection conn;
   
       
    
    public DeleteItem() {
        super();
        try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL,USER,PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String type = request.getParameter("type");
		if(type.equals("1")) {
				String query = "DELETE FROM product_details WHERE product_details.product_id=?";
				try {
					PreparedStatement pt = conn.prepareStatement(query);
					pt.setInt(1, id);
					pt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		else if(type.equals("2")) {
			String query = "DELETE FROM customer_details WHERE customer_details.Customer_ID = ?";
			try {
				PreparedStatement pt = conn.prepareStatement(query);
				pt.setInt(1, id);
				pt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if(type.equals("3")) {
			String query = "DELETE FROM order_details WHERE order_details.order_no = ?";
			try {
				PreparedStatement pt = conn.prepareStatement(query);
				pt.setInt(1, id);
				pt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		response.sendRedirect("adminPage.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
