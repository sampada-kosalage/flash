package onlinegroceryshopping.model;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AdminLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminLog() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(!username.equals("root") || !password.equals("Success123!")){
			response.sendRedirect("adminLogin.jsp?status=1");
		}else{
			
			request.getSession().setAttribute("Admin","1");
			response.sendRedirect("adminPage.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
