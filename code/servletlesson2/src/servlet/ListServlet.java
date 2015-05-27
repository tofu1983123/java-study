package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.wyzc.bbs.entity.Systemprivilege;
import cn.wyzc.bbs.entity.User;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset=utf-8");
	    HttpSession session = request.getSession();
	    List<Systemprivilege> ss = (List<Systemprivilege>)request.getAttribute("ss");
	    PrintWriter out = response.getWriter();
	    User user = (User)session.getAttribute("user");
	    int page = Integer.parseInt(request.getParameter("page"));
	    out.println("<h1>欢迎"+user.getLoginName_()+"的到来</h1>");
	    out.println("<a href='LogoutServlet'>安全退出</a>");
		out.println("<table border=1 align=center width=400>");
		out.println("<tr><th>name</th><th>resource</th><th>action</th></tr>");
		for (Systemprivilege systemprivilege : ss) {
			out.println("<tr>");
			out.println("<td>"+systemprivilege.getName()+"</td>");
			out.println("<td>"+systemprivilege.getResource()+"</td>");
			out.println("<td>"+systemprivilege.getAction()+"</td>");
			out.println("</tr>");
		}
		out.println("<tr>");
		out.println("<td colspan=3>");
		out.println("<a href='LoginSuccessServlet?page="+(page-1)+"'>上一页</a>&nbsp;&nbsp;");
		out.println("<a href='LoginSuccessServlet?page="+(page+1)+"'>下一页</a/>&nbsp;&nbsp;");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("<br/>");
		
	}

}
