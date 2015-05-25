package lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) {
		try {
			// 1.����������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.�������
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
			//System.out.println(con);
			//3.ִ��sql��� java.sql.Statement
			Statement stmt = con.createStatement();
			//4.ִ��sql��ѯ���---->��ѯ�õ����ǽ����java.sql.ResultSet
			String sql = "select * from bbs_user";
			ResultSet rs = stmt.executeQuery(sql);
			//5.���ʽ����
			while(rs.next()){
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			}
			//6.�ر���Դ---->�쳣����Ҫϸ�´���
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
