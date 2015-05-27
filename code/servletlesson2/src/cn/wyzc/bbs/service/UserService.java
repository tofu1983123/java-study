package cn.wyzc.bbs.service;

import java.util.List;

import cn.wyzc.bbs.entity.Role;
import cn.wyzc.bbs.entity.User;

public interface UserService {
	//保证loginName不能重复
	boolean checkLoginName(String loginName);
	//保证Email不能重复
	boolean checkEmail(String email);
	//根据用户名、密码查询
	User findByLoginNameAndPassword(String loginName,String password);
	//修改密码
	User changePassword(User user,String newPassword);
	//注册用户
	int register(User user);
	//查看用户的角色
	List<Role> getRole(String userId);
	
}
