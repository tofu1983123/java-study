package lesson2.proxy;

public class ProxyDemo1 {
	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();
		UserServiceProxy uproxy = new UserServiceProxy();
		uproxy.setUserService(us);
		//us.updateUser();
		//us.insertUser();
		uproxy.updateUser();
		uproxy.insertUser();
	}
}
