package org.study.beans;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controllerr
 */
@WebServlet("/Controllerr")
public class Controllerr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controllerr() {
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
    response.getWriter().println(request.getParameter("name"));
    response.getWriter().println(request.getParameter("gender"));
    response.getWriter().println(request.getParameter("language"));
    response.getWriter().println(request.getParameter("country"));

		doGet(request, response);
	}
	
protected void doPost(HttpServletRequest request,HttpServletResponce response)throws ServletException{
response.getWriter().println(request.getParameter("name"));
response.getWriter().println(request.getParameter("gender"));

response.getWriter().println(request.getParameter("language"));
String[]countries=request.getParameterValues("language");
if(countries!=null) {
	for(int i=0;i<countries.length;i++) {
		System.out.print("<br/>");
		System.out.print(countries[i]);
		

	}
}else {
	System.out.print("None selected");

}
response.getWritter().println(request.getParameter("countries")+"<br/>");
}
}



