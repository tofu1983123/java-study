package lesson2.proxyaccount;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

import lesson2.JdbcUtil;

public class ProxyFactoryBean implements InvocationHandler{
	private Object target;
	
	public ProxyFactoryBean(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Support support = method.getAnnotation(Support.class);
		if(support != null && support.value().equals("none")){
			try {
				proxy = method.invoke(target, args);
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				JdbcUtil.closeConnection();
			}
			return proxy;
		}
		proxy = proxyMethod(proxy, method, args);
		return proxy;
	}

	private Object proxyMethod(Object proxy, Method method, Object[] args) {
		//Connection con = JdbcUtil.getConn();
		try {
			//开启事务
			//con.setAutoCommit(false);
			TransactionManager.begin();
			proxy = method.invoke(target, args);//业务调用
			//con.commit();//提交事务
			TransactionManager.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//con.rollback();
				TransactionManager.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally{
			JdbcUtil.closeConnection();
		}
		return proxy;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
