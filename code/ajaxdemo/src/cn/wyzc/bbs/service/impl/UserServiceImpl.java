package cn.wyzc.bbs.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cn.wyzc.bbs.dao.RoleDao;
import cn.wyzc.bbs.dao.UserDao;
import cn.wyzc.bbs.dao.base.DaoSupport;
import cn.wyzc.bbs.dao.base.RowMapper;
import cn.wyzc.bbs.entity.Role;
import cn.wyzc.bbs.entity.User;
import cn.wyzc.bbs.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao ud;
	private RoleDao rd;
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	public void setRd(RoleDao rd) {
		this.rd = rd;
	}
	public boolean checkLoginName(String loginName) {
		List<User> users = ud.findAll("select * from wyzc_user where loginName_=?", new UserRowMapper(), loginName);
		return users.size() == 0;
	}

	public boolean checkEmail(String email) {
		List<User> users = ud.findAll("select * from wyzc_user where email_=?", new UserRowMapper(), email);
		return users.size() == 0;
	}

	public User findByLoginNameAndPassword(String loginName, String password) {
		//��password���м���
		List<User> users= ud.findAll("select * from wyzc_user where loginName_=? and password_=?", new UserRowMapper(), loginName,password);
		if(users.size() > 0)
			return users.get(0);
		return null;
	}
	private class UserRowMapper implements RowMapper<User>{

		public User getRow(ResultSet rs) throws SQLException {
			User u = new User();
			u.setId(rs.getString("id_"));
			u.setLoginName(rs.getString("loginName_"));
			u.setPassword(rs.getString("password_"));
			u.setEmail(rs.getString("email_"));
			u.setNickName(rs.getString("nickname_"));
			return u;
		}
		
	}
	public User changePassword(User user,String newPassword) {
		//��newPassword���м���
		int n = ud.saveOrUpdate("update wyzc_user set password_=? where id_=?", newPassword,user.getId());
		if(n > 0){
			user.setPassword(newPassword);
		}
		return user;
	}
	public int register(User user) {
		boolean checkLoginName = checkLoginName(user.getLoginName());
		boolean checkMail = checkEmail(user.getEmail());
		user.setId(UUID.randomUUID().toString());
		if(!(checkLoginName && checkMail)){
			return 0;
		}
		int n = ud.saveOrUpdate("insert into wyzc_user(id_,loginName_,password_,nickName_,email_) values(?,?,?,?,?)", user.getId(),user.getLoginName(),user.getPassword(),user.getNickName(),user.getEmail());
		return n;
	}
	public List<Role> getRole(String userId) {
		/*List<String> roleIds = baseDao.findAll("select roleId_ from wyzc_user_role where userId_=?", new RowMapper<String>() {

			public String getRow(ResultSet rs) throws SQLException {
				String s = rs.getString(1);
				return s;
			}
		}, userId);*/
		List<String> roleIds = rd.findForeignId(userId, "select roleId_ from wyzc_user_role where userId_=?");
		
		List<Role> roles = new ArrayList<Role>();
		for (String string : roleIds) {
			Role r = rd.findById(string, "select * from wyzc_role where id_=?", new RowMapper<Role>() {

				public Role getRow(ResultSet rs) throws SQLException {
					Role role = new Role();
					role.setId(rs.getString("id_"));
					role.setName(rs.getString("name_"));
					return role;
				}
			});
			roles.add(r);
		}
		return roles;
	}
}
