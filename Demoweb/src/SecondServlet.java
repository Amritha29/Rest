

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        //getting value from the query string  
	        String n=request.getParameter("uname");  
	        String c=request.getParameter("city");  
	        out.print("Hello " +n +" "+c );  
	        
	        //appending the username in the query string & for rewriting the url
	    //    out.print("<a href = 'SecondServlet?userName = "+n+" &City="+c+"'>visit</a>");  
	  
	        out.close();  
	  
	                }catch(Exception e) {
	                	System.out.println(e);
	                	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
