package lesson2;

import java.util.List;

public class JdbcDemo1 {
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		List<User> users = ud.findByPage(1,4);
		for (User user : users) {
			System.out.println(user);
		}
	}
}
