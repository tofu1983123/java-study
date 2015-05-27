package test;

import java.util.List;
import java.util.UUID;

import cn.wyzc.bbs.dao.RoleDao;
import cn.wyzc.bbs.dao.UserDao;
import cn.wyzc.bbs.dao.base.DaoSupport;
import cn.wyzc.bbs.dao.factory.DaoFactory;
import cn.wyzc.bbs.dao.impl.RoleDaoImpl;
import cn.wyzc.bbs.entity.Role;
import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.service.impl.UserServiceImpl;

public class UserServiceImplTest {

	public static void main(String[] args) {
		UserServiceImpl us = new UserServiceImpl();
		UserDao ud = DaoFactory.getUserDao();
		RoleDao rd = new RoleDaoImpl();
		us.setRd(rd);
		us.setUd(ud);
		//System.out.println(us.checkLoginName("��"));
		//System.out.println(us.checkEmail("xx@163.com"));
		//User user = us.findByLoginNameAndPassword("����", "xyzxyz");
		/*if(user != null)
			System.out.println(user);
		else
			System.out.println("��½ʧ��");*/
		/*if(user != null){
			user = us.changePassword(user, "123456");
			System.out.println(user);
		}*/
		/*User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setLoginName_("����");
		user.setPassword("xyzxyz");
		user.setNickName_("������");
		user.setEmail("aa@163.com");
		us.register(user);*/
		List<Role> roles = us.getRole("6d15e85e-7504-4a9d-8782-249da03a2fe9");
		for (Role role : roles) {
			System.out.println(role.getName());
		}
	}

}
