package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWriterServlet
 */
public class CookieWriterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieWriterServlet() {
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
		String name = "zhangsan";
		String id = UUID.randomUUID().toString();
		Cookie cookie1 = new Cookie("name", name);
		Cookie  cookie2 = new Cookie("id",id);
		
		cookie1.setMaxAge(60*3600);
		cookie2.setMaxAge(60*3600);
		
		//cookie1.setPath("/");
		//cookie2.setPath("/")
		//响应给客户端  一定是跟HttpServletResponse相关
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Cookie write ...success</h1>");
	}

}
