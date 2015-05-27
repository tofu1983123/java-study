package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTest2
 */
public class ServletContextTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String context = this.getServletContext().getInitParameter("hello");
		out.println(context+"<br/>");
		String hello = this.getServletConfig().getInitParameter("servlethello");
		out.println(hello+"<br/>");
		//   /ÏîÄ¿Ãû
		out.println("<h1>"+this.getServletContext().getContextPath()+"</h1>");
	    out.println("<h1>"+this.getServletContext().getRealPath("/")+"</h1>");
	    out.println("<h1>"+this.getServletContext().getServerInfo()+"</h1>");
	    
	    System.out.println(this.getServletContext());
	    String data  =(String) this.getServletContext().getAttribute("servlectContext");
	    out.println("<h1>"+data+"</h1>");
	    
	}

}
