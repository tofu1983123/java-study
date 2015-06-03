package cn.wyzc.bbs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.factory.ServiceFactory;
import cn.wyzc.bbs.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us = ServiceFactory.getUs();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		/*String action = request.getParameter("action");
		if("loginUI".equals(action)){
			loginUI(request,response);
		}else if("registUI".equals(action)){
			registUI(request,response);
		}else if("login".equals(action)){
			login(request,response);
		}else if("logon".equals(action)){
			login(request,response);
		}else if("regist".equals(action)){
			regist(request,response);
		}else if("changePasswordUI".equals(action)){
			changePasswordUI(request,response);
		}else if("changePassword".equals(action)){
			changePassword(request,response);
		}*/
		String action = request.getParameter("action");
		if("checkMail".equals(action)){
			checkMail(request,response);
		}
		if("checkName".equals(action)){
			checkName(request,response);
		}
	}
	protected void checkName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//out.print("hello");
		String username = request.getParameter("username");
		System.out.println(username+"..."+request.getMethod());
		//out.print(username);
		boolean flag = us.checkLoginName(username);
		out.print(flag);
	}
	protected void checkMail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//out.print("hello");
		String email = request.getParameter("email");
		boolean flag = us.checkEmail(email);
		out.print(flag);
	}
	private void changePassword(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String newPassword = request.getParameter("password");
		user = us.changePassword(user, newPassword);
		response.sendRedirect("CategoryServlet?action=list");
	}
	private void changePasswordUI(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/user/changePasswordUI.jsp").forward(request, response);
		
	}
	private void regist(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickName = request.getParameter("nickname");
		String email = request.getParameter("email");
		User user = new User();
		user.setLoginName(username);
		user.setPassword(password);
		user.setNickName(nickName);
		user.setEmail(email);
		int n = us.register(user);
		if(n > 0){
			loginUI(request,response);
		}else{
			registUI(request,response);
		}
	}
	private void logon(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("UserServlet?action=loginUI");
	}

	private void registUI(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/user/regist.jsp").forward(request, response);
	}

	private void loginUI(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/user/login.jsp").forward(request, response);
	}
	
	private void login(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = us.findByLoginNameAndPassword(username, password);
		HttpSession session = request.getSession();
		if(user == null){
			session.setAttribute("msg", "用户不存在");
			response.sendRedirect("UserServlet?action=loginUI");
		}else{
			session.setAttribute("msg", "");
			session.setAttribute("user", user);
			response.sendRedirect("CategoryServlet?action=list");
		}
	}
}
