package lesson2.proxy;

public class UserServiceImpl implements UserService{

	public void insertUser() {
		//System.out.println("开启事务");
		System.out.println("通过多个or一个dao操作完成增加用户的业务");
		//System.out.println("提交事务,如果有异常就回滚事务");
	}

	public void updateUser() {
		//System.out.println("开启事务");
		System.out.println("通过多个or一个dao操作完成修改用户的业务");
		//System.out.println("提交事务,如果有异常就回滚事务");
	}

	public void deleteUser() {
		
		System.out.println("通过多个or一个dao操作完成删除用户的业务");
		
	}
	
}
