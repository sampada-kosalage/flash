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

/**
 * Servlet implementation class UpdateProduct
 */
@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static final String URL = "jdbc:mysql://localhost:3306/";
	    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	    private static final String USER = "root";
	    private static final String PASS = "Success123!";
	    java.sql.Connection conn;
    
       
   
    public UpdateProduct() {
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
		String pname = request.getParameter("pname");
		String desc = request.getParameter("desc");
		String img = request.getParameter("img");
		int cat = Integer.parseInt(request.getParameter("cat"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		String query = "UPDATE product_details SET product_name = ?, prod_img = ?, product_desc = ?, product_price = ?, cat_id = ? WHERE product_details.product_id = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,pname);
			pst.setString(2, img);
			pst.setString(3, desc);
			pst.setDouble(4, price);
			pst.setInt(5, cat);
			pst.setInt(6, id);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("adminPage.jsp?select=1");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
