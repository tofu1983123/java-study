package lesson2.proxy;

public class UserServiceProxy implements UserService{
	private UserServiceImpl userService;
	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
	public void insertUser() {
		System.out.println("开启事务,日志,权限等等");
		userService.insertUser();
		System.out.println("提交事务,如果有异常就回滚事务");
	}

	public void updateUser() {
		System.out.println("开启事务,日志,权限等等");
		userService.updateUser();
		System.out.println("提交事务,如果有异常就回滚事务");
	}
	public void deleteUser() {
		System.out.println("开启事务,日志,权限等等");
		userService.deleteUser();
		System.out.println("提交事务,如果有异常就回滚事务");
	}
	
}
