package First1Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondservlet
 * @param <PrintWriter>
 */
//@WebServlet("/secondservlet")
public class secondservlet<PrintWriter> extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public secondservlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @param <HttpServletRequest>
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected <HttpServletRequest> void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		PrintWriter pws=response.getWriter();
		String username=(String) request.getAttribute("key");
		pw.println("Welcome"+"<&lt>"+username+"<&gt>"+"!!!");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
