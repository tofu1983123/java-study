package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import cn.wyzc.bbs.dao.base.RowMapper;
import cn.wyzc.bbs.dao.impl.UserDaoImpl;
import cn.wyzc.bbs.entity.User;

public class UserDaoTest {

	public static void main(String[] args) {
		UserDaoImpl ud = new UserDaoImpl();
		/*���Բ���һ����¼*/
		/*String sql = "insert into wyzc_user(id_,loginName_,password_,email_,nickname_) values(?,?,?,?,?)";
		String id = UUID.randomUUID().toString();
		int n = ud.saveOrUpdate(sql, id,"����","123456","xx@163.com","��ŭ��С��");
		System.out.println(n);*/
		/*���Ը���������ѯ*/
		/*User user = ud.findById("6d15e85e-7504-4a9d-8782-249da03a2fe9", "select * from wyzc_user where id_=?", new RowMapper<User>() {
			
			public User getRow(ResultSet rs) throws SQLException {
				User u = new User();
				u.setId(rs.getString("id_"));
				u.setLoginName_(rs.getString("loginName_"));
				u.setPassword(rs.getString("password_"));
				u.setEmail(rs.getString("email_"));
				u.setNickName_(rs.getString("nickname_"));
				return u;
			}
		});
		System.out.println(user);*/
		/*�����޸�����*/
		String sql = "update wyzc_user set password_=? where id_=?";
		int n = ud.saveOrUpdate(sql, "xyzxyz","6d15e85e-7504-4a9d-8782-249da03a2fe9");
		System.out.println(n);
	}

}
