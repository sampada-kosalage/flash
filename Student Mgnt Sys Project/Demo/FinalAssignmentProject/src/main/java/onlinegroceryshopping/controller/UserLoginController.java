package onlinegroceryshopping.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.User;


@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserLoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = dao.getUser(email);
		if (user == null) {
			response.sendRedirect("adminLogin.jsp?status=2");
		} else if( !user.getPassword().equals("password")){
			response.sendRedirect("adminLogin.jsp?status=1");
		}else{
			
			request.getSession().setAttribute("Admin","1");
			response.sendRedirect("adminPage.jsp");
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
