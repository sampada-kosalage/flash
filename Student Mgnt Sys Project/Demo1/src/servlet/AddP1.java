package servlet;
import java.io.IOException;
import lookup.lookup;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoP1;

/**
 * Servlet implementation class AddP1
 */
@WebServlet("/AddP1")
public class AddP1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddP1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Message from the Server ").append(request.getContextPath());
		response.setContentType("text/html");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fn=request.getParameter("fn");
		String id=request.getParameter("id");
		//----------------getParameter
		//AddZ.java01 String COL=request.getParameter("COL");
		String P1C1=request.getParameter("P1C1");
		String P1C2=request.getParameter("P1C2");
		String P1C3=request.getParameter("P1C3");

				
		try 
		{
			lookup l=lookup.getlookup();
			daoP1 dao=new daoP1();
			System.out.println('\n'+fn+','+id
					//AddZ.java02 +','+COL
						+','+P1C1
						+','+P1C2
						+','+P1C3
			);
			int rv=dao.addP1Details(fn,Integer.parseInt(id)
					//AddZ.java03 ,COL
						,P1C1
						,P1C2
						,P1C3
				);
			 //request.getRequestDispatcher(l.tab).forward(request, response);
				PrintWriter out = response.getWriter();
				out.println("<HTML>");
				out.println("<TITLE>Data Information</TITLE>");
				out.println("<BODY ><CENTER><br/><br/><br/><br/>");
				if(rv==0)
				{

					out.println("<p><font color='green'>DATA INSERTED SUCCESSFULLY</p>");
					out.println("<button onclick=\"window.close();\">OK</a>");
				}
				else 
				{
					out.println("<p><font color='red'>DATA INSERT FAILED</p>");
					out.println("<a href=\"#\" onclick=\"location.href = document.referrer; return false;\">Back</a>");
				}
				
				out.println("</CENTER></BODY></HTML>");
		}
		catch(Exception e)
		{
			System.out.println("handling code "+e.getMessage());
			  
		}
	}
	

}
