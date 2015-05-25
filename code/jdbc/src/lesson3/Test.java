package lesson3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			/*String sql = "insert into bbs_user(username,password,birthday) values(?,?,?)";
			PreparedStatement pstmt = con.prepareCall(sql);
			pstmt.setString(1, "wangwu");
			pstmt.setString(2, "xxxx");
			pstmt.setDate(3, new java.sql.Date(new java.util.Date().getTime()));
			pstmt.executeUpdate();*/
			int page = 1;
			int pagesize = 2;
			String sql = "select * from bbs_user limit ?,?";
			int begin = (page - 1) * pagesize;
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, begin);
			pstmt.setInt(2, pagesize);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("username")+","+rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
