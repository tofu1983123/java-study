package lesson2.orm;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lesson2.Account;
import lesson2.JdbcUtil;
import lesson2.User;


public class Session {
	public static void main(String[] args) {
		Session session = new Session();
		Account account = new Account(1010,1000,"sunwukong");
		//System.out.println(session.getSql(account));
		//int n = session.save(account);
		//System.out.println(n);
		/*TT tt = new TT();
		tt.setId(1);
		tt.setName("xx");
		tt.setPass("123");
		session.save(tt);*/
		//User user = new User(1111,"xxxx","yyyy","1@163.com");
		//session.save(user);
		
		Forum forum = new Forum();
		forum.setId(1);
		forum.setName("Java学习");
		session.save(forum);
	}
	/**
	 * 往数据库中增加一条记录
	 * 哪个数据库 obj对象所属类对应的表
	 * 记录内容和对象的属性内容相同
	 * 思路:就是要获取insert into 表名(字段1,字段2,...) values(?,?,...)
	 * @param obj
	 * @return
	 */
	public int save(Object obj){
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			pstmt = getStatement(con,obj);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, null);
			JdbcUtil.closeConnection();
		}
		return n;
	}
	private PreparedStatement getStatement(Connection con,Object obj) throws SQLException{
		String sql = getSql(obj);
		System.out.println(sql);
		PreparedStatement pstmt = con.prepareStatement(sql);
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		try {
			for(int i = 0;i < fs.length;i++){
				fs[i].setAccessible(true);
				pstmt.setObject(i + 1, fs[i].get(obj));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	/**
	 * 获取sql语句
	 * @param obj
	 * @return
	 */
	private String getSql(Object obj){
		StringBuilder s = new StringBuilder();
		s.append("insert into ");
		Class c = obj.getClass();
		String tablename = c.getSimpleName();
		Entity entity = (Entity)c.getAnnotation(Entity.class);
		if(entity != null)
			tablename = entity.value();
		s.append(tablename).append("(");
		Field[] fs = c.getDeclaredFields();
		for(int i = 0;i < fs.length;i++){
			String fieldname = fs[i].getName();
			Column column = fs[i].getAnnotation(Column.class);
			if(column != null)
				fieldname = column.value();
			s = i == 0 ? s.append(fieldname) : s.append(",").append(fieldname);
		}
		s.append(") values").append(getString(fs.length));
		return s.toString();
	}
	/**
	 * 得到类似(?,?,...)的语句
	 * @param length ?的个数
	 * @return
	 */
	private String getString(int length){
		StringBuilder s = new StringBuilder();
		s.append("(");
		for(int i = 0;i < length;i++){
			s = i == 0 ? s.append("?") : s.append(",?");
		}
		s.append(")");
		return s.toString();
	}
}
