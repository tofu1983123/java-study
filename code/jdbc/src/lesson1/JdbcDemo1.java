package lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {
	public static void main(String[] args) {
		try {
			// 1.加载驱动类
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.获得连接
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
			//System.out.println(con);
			//3.执行sql语句 java.sql.Statement
			Statement stmt = con.createStatement();
			//4.执行sql查询语句---->查询得到的是结果集java.sql.ResultSet
			String sql = "select * from bbs_user";
			ResultSet rs = stmt.executeQuery(sql);
			//5.访问结果集
			while(rs.next()){
				System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
			}
			//6.关闭资源---->异常后面要细致处理
			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
