package onlinegroceryshopping.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;

import onlinegroceryshopping.DAO.GroceryDAO;


@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {

	GroceryDAO dao = new GroceryDAO();
   
	private static final long serialVersionUID = 1L;
    
    public UserRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		user.setUser_id(request.getParameter("userid"));
        user.setUser_name(request.getParameter("username"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setPhone_number(request.getParameter("phoneNumber"));
		dao.registerUser(user);
		response.sendRedirect("adminLogin.jsp");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
