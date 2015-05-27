package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
	private FilterConfig filterConfig;
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		//request.setCharacterEncoding("utf-8");
		request.setCharacterEncoding(filterConfig.getInitParameter("encode"));
		System.out.println("拦截了");
		arg2.doFilter(arg0, arg1);//继续过滤链,没有这句话,请求不能继续往下.
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("初始化了FilterConfig");
		this.filterConfig = arg0;
	}
	
}
