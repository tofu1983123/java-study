package lesson1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoBean {
	/**
	 * 增加一条记录
	 * @param user
	 * @return
	 */
	public int addUser(User user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			String sql = "insert into bbs_user(id,username,userpass,email) values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getUserpass());
			pstmt.setString(4, user.getEmail());
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(con, pstmt, null);
		}
		return n;
	}
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<User> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<User> users = new ArrayList<User>();
		try {
			con = JdbcUtil.getConn();
			String sql = "select * from bbs_user";
			pstmt = con.prepareStatement(sql);			
			rs = pstmt.executeQuery();
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
			JdbcUtil.close(con, pstmt, rs);
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
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			String sql = "update bbs_user set username=?,userpass=?,email=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getUserpass());
			pstmt.setString(3, user.getEmail());
			pstmt.setInt(4, user.getId());
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(con, pstmt, null);
		}
		return n;
	}
	/**
	 * 根据主键查询一条记录
	 */
	public User findById(int id){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			con = JdbcUtil.getConn();
			String sql = "select * from bbs_user where id ="+id;
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
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
			JdbcUtil.close(con, pstmt, rs);
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
			JdbcUtil.close(con, stmt, rs);
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
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			String sql = "delete bbs_user where id="+id;
			pstmt = con.prepareStatement(sql);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(con, pstmt, null);
		}
		return n;
	}
}
