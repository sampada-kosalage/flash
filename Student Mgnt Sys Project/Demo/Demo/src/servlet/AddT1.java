package servlet;
import java.io.IOException;
import lookup.lookup;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoT1;

/**
 * Servlet implementation class AddT1
 */
@WebServlet("/AddT1")
public class AddT1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddT1() {
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
		String T1C1=request.getParameter("T1C1");
		String T1C2=request.getParameter("T1C2");
		String T1C3=request.getParameter("T1C3");

				
		try 
		{
			lookup l=lookup.getlookup();
			daoT1 dao=new daoT1();
			System.out.println('\n'+fn+','+id
					//AddZ.java02 +','+COL
						+','+T1C1
						+','+T1C2
						+','+T1C3
			);
			int rv=dao.addT1Details(fn,Integer.parseInt(id)
					//AddZ.java03 ,COL
						,T1C1
						,T1C2
						,T1C3
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
