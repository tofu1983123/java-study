package servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionLisener implements HttpSessionListener{
	private int i = 0;
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("session创建了");
		i++;
		arg0.getSession().getServletContext().setAttribute("count", i);
		System.out.println(i);
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("session销毁了");
		i--;
		arg0.getSession().getServletContext().setAttribute("count", i);
	}
}
