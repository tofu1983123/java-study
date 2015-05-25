package lesson1;

import java.sql.Connection;
import java.sql.Statement;

public class JdbcDemo3 {
	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			Statement stmt = con.createStatement();
			//增加一条记录
			/*int id = 1003;
			String name = "asan";
			String pass = "asan";
			String email = "as@163.com";
			String sql = "insert into bbs_user(id,username,userpass,email)"+
					" values("+id+",'"+name+"','"+pass+"','"+email+"')";
			int n = stmt.executeUpdate(sql);
			System.out.println(n);*/
			//修改记录
			int id = 1002;
			String pass = "li123";
			String email  = "lisi@163.com";
			String sql = "update bbs_user set userpass = '"+pass+"',email = '"+email+"' where id = "+ id +"";
			stmt.executeUpdate(sql);
			
			JdbcUtil.close(con, stmt, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
