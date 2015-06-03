package cn.wyzc.bbs.service;

import java.util.List;

import cn.wyzc.bbs.entity.Role;
import cn.wyzc.bbs.entity.User;

public interface UserService {
	//��֤loginName�����ظ�
	boolean checkLoginName(String loginName);
	//��֤email�����ظ�
	boolean checkEmail(String email);
	//�����û���,�����ѯ
	User findByLoginNameAndPassword(String loginName,String password);
	//�޸�����
	User changePassword(User user,String newPassword);
	//ע���û�
	int register(User user);
	//�鿴�û��Ľ�ɫ��Ϣ
	List<Role> getRole(String userId);
}
