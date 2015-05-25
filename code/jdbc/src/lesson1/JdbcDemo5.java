package lesson1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcDemo5 {
	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			/*Statement stmt = con.createStatement();
			int id = 1006;
			String name = "lisi";
			String pass = "lisi123";
			String email = "li@163.com";
			String sql = "insert into bbs_user(id,username,userpass,email) values("+id+",'"+name+"','"+pass+"','"+email+"')";
			int n = stmt.executeUpdate(sql);
			JdbcUtil.close(con, stmt, null);*/
			int id = 1006;
			String name = "lisi";
			String pass = "lisi123";
			String email = "li@163.com";
			String sql = "insert into bbs_user(id,username,userpass,email) values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pass);
			pstmt.setString(4, email);
			int n = pstmt.executeUpdate();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
