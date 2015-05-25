package lesson1;

import java.util.List;

public class JdbcDemo7 {
	public static void main(String[] args) {
		UserDaoBean udb = new UserDaoBean();
		/*User user = new User(1007,"sunwukong","111","wk@163.com");
		int n = udb.addUser(user);
		System.out.println(n);*/
		/*List<User> users = udb.getAll();
		for (User user : users) {
			System.out.println(user);
		}*/
		/*User user = udb.findById(1007);
		System.out.println(user);
		user.setUsername("wukong");
		user.setUserpass("1111");
		udb.updateUser(user);*/
		udb.deleteUser(1007);
	}

}
