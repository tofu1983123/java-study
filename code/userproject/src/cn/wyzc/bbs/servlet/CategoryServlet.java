package cn.wyzc.bbs.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.wyzc.bbs.entity.Category;
import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.factory.ServiceFactory;
import cn.wyzc.bbs.service.CategoryService;

/**
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CategoryService cs = ServiceFactory.getCs();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
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
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		if(user == null){//说明未登陆
			response.sendRedirect("UserServlet?action=loginUI");
			return;
		}
		String action = request.getParameter("action");
		if("list".equals(action)){
			categoryList(request,response);
		}else if("updateUI".equals(action)){
			update(request,response);
		}
		
			
	}
	private void categoryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Category> categorys = cs.findAll();
		request.setAttribute("categorys", categorys);
		this.getServletContext().getRequestDispatcher("/WEB-INF/category/categorylist.jsp").forward(request, response);
		
	}
	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categoryId = request.getParameter("categoryId");
		Category category = cs.findById(categoryId);
		request.setAttribute("category", category);
		this.getServletContext().getRequestDispatcher("/WEB-INF/category/update.jsp").forward(request, response);
		
	}
}
