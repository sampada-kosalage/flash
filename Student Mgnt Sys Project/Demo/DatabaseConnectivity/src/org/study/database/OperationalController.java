package org.study.database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/OperationalController")
public class OperationalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Integer = null;
       @Resource(name="jdbc/project")
       private DataSource dataSource;
       
   
    public OperationalController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page=request.getParameter("page");
		page=page.toLowerCase();
		
		switch(page) {
		case "listusers":
			listUsers(request,response);
			break;
		case "adduser":
		    addUserFormLoader(request,response);
		    break;
		case "updateuser":
			UpdateUserFormLoader(request,response);
		case "deleteuser":
			deleteUser(Integer,parseInt(request.getParameter("userId")));
			listUsers(request,response);
			break;
	     default:
	    	 errorPage(request,response);
		}
	}
	
	private Object parseInt(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	private void deleteUser(String userid, Object object) {
		new UserModel().deleteUser(dataSource,userid);
		return;
	}
	private void UpdateUserFormLoader(HttpServletRequest request, HttpServletResponse response) {
 request.setAttribute("title", "Update user");
      try {
    	  request.getRequestDispatcher("updateUser.jsp").forward(request,response);
    	  
      }catch(ServletException | IOException e) {
    	  e.printStackTrace();
      }
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String operation=request.getParameter("form");
	   operation=operation.toLowerCase();
	   switch(operation) {
	   
	   }
	}
	   
	   private void addUserOperation(org.apache.catalina.User newUser) {
		   new UserModel().addUser(dataSource,newUser);
		   return;
	   }
		public void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          List<User>listUser=new ArrayList<>();
          listUser=new UserModel().listUsers(dataSource);
          request.setAttribute("listUser", listUser);
          request.setAttribute("title", "list of users");
          request.getRequestDispatcher("listUser.jsp").forward(request,response);
	}
		
		public void addUserFormLoader(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

			request.setAttribute("title", "Add User");
			request.getRequestDispatcher("addUser.jsp").forward(request,response);
}
		public void errorPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

			request.setAttribute("title", "Error page");
			request.getRequestDispatcher("r").forward(request,response);
}
	}
