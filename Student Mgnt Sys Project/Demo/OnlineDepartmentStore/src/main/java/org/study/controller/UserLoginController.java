package org.study.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UserLoginController extends HttpServlet{
	
	org.study.dao.GroceriesDao dao = new org.study.dao.GroceriesDao();
	
    public UserLoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		org.study.pojo.User user = dao.getUser(email);
		if (user == null) {
			response.sendRedirect("adminLogin.jsp?status=2");
		} else if( !user.getPassword().equals(password)){
			response.sendRedirect("adminLogin.jsp?status=1");
		}else{
			request.getSession().setAttribute("Admin","1");
			request.getSession().setAttribute("role",user.getRole());
			response.sendRedirect("adminPage.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
