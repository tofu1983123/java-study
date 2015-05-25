package lesson2.proxy;

public class UserServiceProxy implements UserService{
	private UserServiceImpl userService;
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
	public void insertUser() {
		System.out.println("��������,��־,Ȩ�޵ȵ�");
		userService.insertUser();
		System.out.println("�ύ����,������쳣�ͻع�����");
	}

	public void updateUser() {
		System.out.println("��������,��־,Ȩ�޵ȵ�");
		userService.updateUser();
		System.out.println("�ύ����,������쳣�ͻع�����");
	}
	public void deleteUser() {
		System.out.println("��������,��־,Ȩ�޵ȵ�");
		userService.deleteUser();
		System.out.println("�ύ����,������쳣�ͻع�����");
	}
	
}
