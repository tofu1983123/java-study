package lesson1;

import java.util.List;

public class JdbcDemo4 {
	public static void main(String[] args) {
		//��������һ����¼
		UserDao ud = new UserDao();
//		User user = new User(1004,"tianqi","123tian","t@163.com");
//		int n = ud.addUser(user);
//		System.out.println(n);
		//���Բ�ѯ����
//		List<User> users = ud.getAll();
//		for (User user : users) {
//			System.out.println(user);
//		}
		//���Ը���������ѯ��¼
		/*User user = ud.findById(1001);
		if(user != null)
			System.out.println(user);
		//�����޸�
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
