package lesson1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo6 {
	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			/*Statement stmt = con.createStatement();
			String name = "zhangsan";
			//如果密码的内容类似这样的值,那么拼接后的sql语句恒成立
			//String pass = "123' or 'a' = 'a";
			//
			// sql语句拼接后如下:
			// select * from bbs_user where username='zhangsan' and userpass='123' or 'a' = 'a'
			// 恒成立
			// 其实不存在这个用户,不存在这样的记录,这样叫Sql注入.
			String pass = "12344";
			String sql = "select * from bbs_user where username='"+name+"' and userpass='"+pass+"'";
			//System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs.next());*/
			String name = "zhangsanxxx";
			String pass = "123' or 'a' = 'a";
			PreparedStatement pstmt = con.prepareStatement("select * from bbs_user where username = ? and userpass = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
