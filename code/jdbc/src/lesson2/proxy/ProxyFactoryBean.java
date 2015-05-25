package lesson2.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactoryBean implements InvocationHandler{
	private Object target;//Ŀ�����---->����Ŀ�������κη������ᱻinvoke��������
	public ProxyFactoryBean(Object target){
		this.target = target;
	}
	/**
	 * ����method �������غ�,���ص�Ŀ�����ķ���
	 * ����args ���Ƿ����Ĳ���
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("��������,��־,Ȩ�޵ȵ�");
		proxy = method.invoke(target, args);//Ŀ�귽���ĵ���
		System.out.println("�ύ����,������쳣�ͻع�����");
		return proxy;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
}
