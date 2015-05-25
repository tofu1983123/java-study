package lesson2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JdbcDemo4 {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getConn();
		try {
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println(dmd.getDatabaseProductVersion());
			System.out.println(dmd.getDatabaseProductName());
			//获取数据库的信息就通过DatabaseMetaData
			PreparedStatement pstmt = con.prepareStatement("select * from bbs_user");
			ResultSet rs = pstmt.executeQuery();
			//封装的是结果集的信息
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			System.out.println(cols);
			for(int i = 1;i <= cols;i++){
				System.out.println(rsmd.getColumnName(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
