package lesson1;

import java.util.List;

public class JdbcDemo4 {
	public static void main(String[] args) {
		//测试增加一条记录
		UserDao ud = new UserDao();
//		User user = new User(1004,"tianqi","123tian","t@163.com");
//		int n = ud.addUser(user);
//		System.out.println(n);
		//测试查询所有
//		List<User> users = ud.getAll();
//		for (User user : users) {
//			System.out.println(user);
//		}
		//测试根据主键查询记录
		/*User user = ud.findById(1001);
		if(user != null)
			System.out.println(user);
		//测试修改
		user.setUsername("lisi_name");
		user.setUserpass("123lisi");
		ud.updateUser(user);*/
		
		/*User user = new User();
		//user.setUsername("lisi");
		List<User> users = ud.findBy(user);
		for (User user2 : users) {
			System.out.println(user2);
		}*/
		ud.deleteUser(1006);
	}
}
