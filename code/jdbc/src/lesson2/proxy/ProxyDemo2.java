package lesson2.proxy;

public class ProxyDemo2 {
	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();//Ŀ�����
		//��������,������
		ProxyFactoryBean pfb = new ProxyFactoryBean(us);
		//��������
		UserService usProxy = (UserService)pfb.getProxy();
		usProxy.deleteUser();
		usProxy.updateUser();
	}
}
