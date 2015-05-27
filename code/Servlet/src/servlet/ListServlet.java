package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SystemprivilegeService;

import dao.DaoSupport;
import dao.RowMapper;
import dao.Systemprivilege;

/**
 * Servlet implementation class ListServlet
 */
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
		PrintWriter out = response.getWriter();
		int page = Integer.parseInt(request.getParameter("page"));
		if(page == 0)
			page = 1;
		/*DaoSupport<Systemprivilege> ds = new DaoSupport<Systemprivilege>();
		List<Systemprivilege> ss = ds.findAll(
				"select * from wyzc_systemprivilege",
				new RowMapper<Systemprivilege>() {

					@Override
					public Systemprivilege getRow(ResultSet rs)
							throws SQLException {
						// TODO Auto-generated method stub
						Systemprivilege s = new Systemprivilege();
						s.setId(rs.getString("id_"));
						s.setName(rs.getString("name_"));
						s.setResource(rs.getString("resource_"));
						s.setAction(rs.getString("action_"));
						return s;
					}
				});
				*/
		SystemprivilegeService ps = new SystemprivilegeService();
		List<Systemprivilege> ss = ps.findByPage(5,page);
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
