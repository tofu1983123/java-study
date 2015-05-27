package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextTest
 */
public class ServletContextTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hello = this.getServletConfig().getInitParameter("servlethello");
	     
		ServletContext servletContext = this.getServletContext();
		ServletContext servletContext2 = this.getServletConfig().getServletContext();
		PrintWriter out = response.getWriter();
		out.println("<h1>"+hello+"</h1>");
		out.println("<h1>"+(servletContext==servletContext2)+"</h1>");
		String context = servletContext.getInitParameter("hello");
		out.println("<h1>"+context+"</h1>");
		System.out.println(servletContext);
		servletContext.setAttribute("servlectContext","servlectContextData");
		
	}

}
