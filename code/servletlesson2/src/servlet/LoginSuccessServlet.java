package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.wyzc.bbs.entity.Systemprivilege;
import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.service.impl.SystemprivilegeService;

/**
 * Servlet implementation class LoginSuccessServlet
 */
public class LoginSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSuccessServlet() {
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
		response.setContentType("text/html;charset=utf-8");
		/*HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		PrintWriter out = response.getWriter();
	
	    System.out.println(session.getId());
		out.println("<h1>登陆成功!</h1>");
		out.println("<h1>欢迎"+user.getLoginName_()+"来访问!</h1>");
		out.println("<a href='SessionServlet'>aaaa</a>");
		
		out.println("<br/>");
		String str1 = (String)request.getAttribute("request");
		String str2 = (String)session.getAttribute("session");
		String str3 = (String)this.getServletContext().getAttribute("global");
		out.println("<h1>request..."+str1+"</h1>");
		out.println("<h1>session..."+str2+"</h1>");
		out.println("<h1>servletContext..."+str3+"</h1>");*/
		int page = Integer.parseInt(request.getParameter("page"));
		
		SystemprivilegeService ps = new SystemprivilegeService();
		List<Systemprivilege> ss = ps.findByPage(5,page);
		HttpSession session = request.getSession();
		//session.setAttribute("ss", ss);
		request.setAttribute("ss", ss);
		//response.sendRedirect("ListServlet");
		this.getServletContext()
		.getRequestDispatcher("/ListServlet?page="+page)
		.forward(request, response);
	}

}
