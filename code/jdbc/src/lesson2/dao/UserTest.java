package lesson2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import lesson2.User;

public class UserTest {

	public static void main(String[] args) {
		DaoSupport<User> dao = new DaoSupport<User>();
		//User u = dao.findById(1005, "select * from bbs_user where id = ?", new UserMapper());
		//System.out.println(u);
		//List<User> users = dao.find("select * from bbs_user where username = ? and userpass = ?", new UserMapper(), "lisi","li123");
		/*List<User> users = dao.find("select * from bbs_user", new UserMapper());
		for (User user : users) {
			System.out.println(user);
		}*/
		User user = new User(1007,"xxx","yyy","zzz");
		int n = dao.saveOrUpdateOrDelete("insert into bbs_user(id,username,userpass,email) values(?,?,?,?)", user.getId(),user.getUsername(),user.getUserpass(),user.getEmail());
		System.out.println(n);
	}
	static class UserMapper implements RowMapper<User>{
		public User getRow(ResultSet rs) throws SQLException {
			User u = new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setUserpass(rs.getString("userpass"));
			u.setEmail(rs.getString("email"));
			return u;
		}
		
	}
}
