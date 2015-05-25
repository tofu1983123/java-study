package lesson2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	/**
	 * 增加一条记录
	 * @param user
	 * @return
	 */
	public int addUser(User user) {
		Connection con = null;
		Statement stmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			// String sql =
			// "insert into bbs_user(id,username,userpass,email) values("+user.getId()+",'"+user.getUsername()+"','"+user.getUserpass()+"','"+user.getEmail()+"')";
			String sql = "insert into bbs_user(id,username,userpass,email) values("
					+ user.getId()
					+ ",'"
					+ user.getUsername()
					+ "','"
					+ user.getUserpass() + "','" + user.getEmail() + "')";
			n = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, null);
		}
		return n;
	}
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<User> getAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<User> users = new ArrayList<User>();
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			String sql = "select * from bbs_user";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setUserpass(rs.getString("userpass"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt, rs);
		}
		return users;
	}
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int updateUser(User user) {
		Connection con = null;
		Statement stmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			String sql = "update bbs_user set username='" + user.getUsername()
					+ "',userpass='" + user.getUserpass() + "',email='"
					+ user.getEmail() + "' where id=" + user.getId();
			n = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(stmt, null);
		}
		return n;
	}
	/**
	 * 根据主键查询一条记录
	 */
	public User findById(int id){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			String sql = "select * from bbs_user where id ="+id;
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setUserpass(rs.getString("userpass"));
				user.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(stmt, rs);
		}
		return user;
	}
	/**
	 * User对象中除主键外(不要给id赋值),
	 * 哪个属性有值,就根据哪个属性查询
	 * 不定条件查询
	 * @param user
	 * @return
	 */
	public List<User> findBy(User user){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<User> users = new ArrayList<User>();
		String sql = "select * from bbs_user where 1 = 1";
		String username = user.getUsername();
		if(username != null ){
			sql += " and username='"+username+"'";
		}
		String userpass = user.getUserpass();
		if(userpass != null ){
			sql += " and userpass='"+userpass+"'";
		}
		String email = user.getEmail();
		if(email != null ){
			sql += " and email='"+email+"'";
		}
		System.out.println(sql);
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setUserpass(rs.getString("userpass"));
				u.setEmail(rs.getString("email"));
				users.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(stmt, rs);
		}
		return users;
	}
	/**
	 * 根据主键删除记录
	 * @param id
	 * @return
	 */
	public int deleteUser(int id){
		Connection con = null;
		Statement stmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			stmt = con.createStatement();
			String sql = "delete bbs_user where id="+id+"";
			n = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(stmt, null);
		}
		return n;
	}
	/**
	 * 分页功能
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<User> findByPage(int page,int pageSize){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<User> users = new ArrayList<User>();
		try {
			con = JdbcUtil.getConn();
			int begin = (page - 1) * pageSize + 1;
			int end = page * pageSize;
			String sql = "select id,username,userpass,email from"
					+ "(select id,username,userpass,email,rownum rn from bbs_user order by id) "
					+ "where rn between ? and ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, begin);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setUserpass(rs.getString("userpass"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return users;
	}
}
