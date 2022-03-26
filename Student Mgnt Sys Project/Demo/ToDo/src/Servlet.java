

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("Action").equals("Add User")) {
		      System.out.println("in");
		      PrintWriter printWriter = response.getWriter();
		      User user = new User();
		      UserDao dao = new UserDao();
		      user.setFirstname((request.getParameter("firstname")));
		      user.setLastname((request.getParameter("lastname")));
		      user.setEmail((request.getParameter("email")));
		      user.setUsername((request.getParameter("username")));
		      user.setCity((request.getParameter("city")));
		      user.setPhonenumber((request.getParameter("phonenumber")));
		      user.setGender((request.getParameter("gender")));
		      user.setPassword((request.getParameter("password")));

		      
		      boolean result = dao.addUser(user);
		      RequestDispatcher dispatcher = request.getRequestDispatcher("adduser.jsp");
		      dispatcher.include(request, response);
		      printWriter.print("<br><h2>User added Successfully!!</h2>");
		    }
		    if (request.getParameter("Action").equals("Edit")) {
		      PrintWriter printWriter = response.getWriter();
		      User user = new User();
		      UserDao dao = new UserDao();
		      user.setFirstname((request.getParameter("firstname")));
		      user.setLastname((request.getParameter("lastname")));
		      user.setEmail((request.getParameter("email")));
		      user.setUsername((request.getParameter("username")));
		      user.setCity((request.getParameter("city")));
		      user.setPhonenumber((request.getParameter("phonenumber")));
		      user.setGender((request.getParameter("gender")));
		      user.setPassword((request.getParameter("password")));

		      boolean result = dao.editUser(user);
		      System.out.println(result);
		      RequestDispatcher dispatcher = request.getRequestDispatcher("edituser.jsp");
		      dispatcher.include(request, response);
		      printWriter.print("<br><h2>User edited Successfully!!</h2>");
		    }
		    if (request.getParameter("Action").equals("Delete")) {
		      PrintWriter printWriter = response.getWriter();
		      User user = new User();
		      UserDao dao = new UserDao();
		      dao.deleteUser(String.substring(request.getParameter("username")));
		      RequestDispatcher dispatcher = request.getRequestDispatcher("deleteuser.jsp");
		      dispatcher.include(request, response);
		      printWriter.print("<br><h2>User deleted Successfully!!</h2>");
		    }
		  }
		}

