package lesson2.proxy;

public class ProxyDemo2 {
	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();//目标对象
		//代理处理器,代理工厂
		ProxyFactoryBean pfb = new ProxyFactoryBean(us);
		//产生代理
		UserService usProxy = (UserService)pfb.getProxy();
		usProxy.deleteUser();
		usProxy.updateUser();
	}
}
