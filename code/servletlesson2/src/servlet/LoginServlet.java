package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.wyzc.bbs.dao.UserDao;
import cn.wyzc.bbs.dao.impl.UserDaoImpl;
import cn.wyzc.bbs.entity.Systemprivilege;
import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.service.impl.SystemprivilegeService;
import cn.wyzc.bbs.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      String username = request.getParameter("username");
	      String password = request.getParameter("password");
	      UserServiceImpl us = new UserServiceImpl();
	      UserDaoImpl ud = new UserDaoImpl();
	      us.setUd(ud);
	      User user = us.findByLoginNameAndPassword(username, password);
	      HttpSession session = request.getSession();
	      System.out.println(session.getId());
	  	request.setAttribute("request", "request");
		session.setAttribute("session", "session");
		this.getServletContext().setAttribute("global","global");
		
		
		
	      if(user!=null){
	    	 // response.sendRedirect("LoginSuccessServlet");
	    	  session.setAttribute("user", user);
	    	  response.sendRedirect("LoginSuccessServlet?page=1");
	    	  
	      }
	      else
	    	  response.sendRedirect("login.html");
	}

}

