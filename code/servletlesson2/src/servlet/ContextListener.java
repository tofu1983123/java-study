package servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener  implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext对象销毁了!");
		System.out.println("项目结束后的一写销魂工作");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext初始化监听");
		System.out.println(arg0.getServletContext());
		System.out.println("可以做一下项目初始化的前期准备...");
		
	}
	
}
