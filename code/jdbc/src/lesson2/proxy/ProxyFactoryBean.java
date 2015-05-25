package lesson2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean implements InvocationHandler{
	private Object target;//目标对象---->调用目标对象的任何方法都会被invoke方法拦截
	public ProxyFactoryBean(Object target){
		this.target = target;
	}
	/**
	 * 参数method 方法拦截后,拦截的目标对象的方法
	 * 参数args 就是方法的参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("开启事务,日志,权限等等");
		proxy = method.invoke(target, args);//目标方法的调用
		System.out.println("提交事务,如果有异常就回滚事务");
		return proxy;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
