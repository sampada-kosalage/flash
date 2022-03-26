package org.study.beans;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstName=request.getParameter("firstname");
		String LastName=request.getParameter("lastname");
		String UserName=request.getParameter("username");
		String Password=request.getParameter("password");
		String Address=request.getParameter("address");
		String ContactNumber=request.getParameter("contactnumber");

		if(FirstName.isEmpty()||LastName.isEmpty()||UserName.isEmpty()||Password.isEmpty()||Address.isEmpty()||ContactNumber.isEmpty()){
			RequestDispatcher req=request.getRequestDispatcher("registrationform.jsp");
			req.include(request,response);
		}
		else 
		{
			RequestDispatcher req=request.getRequestDispatcher("registrationform1.jsp");
			req.forward(request, response);
		}
	}

}
