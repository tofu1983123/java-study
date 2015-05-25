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
			//��ȡ���ݿ����Ϣ��ͨ��DatabaseMetaData
			PreparedStatement pstmt = con.prepareStatement("select * from bbs_user");
			ResultSet rs = pstmt.executeQuery();
			//��װ���ǽ��������Ϣ
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
