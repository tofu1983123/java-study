package lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:ORCL", "scott", "tiger");
			Statement stmt = con.createStatement();
			String sqlA = "insert into bbs_user(id,username,userpass,email)"+
						"values(1004,'wangwu','12345','cc@163.com')";
			String sqlB = "update bbs_user set userpass = 'wwpass' where " + 
						"id = 1004";
			String sqlC = "delete bbs_user where id = 1004";
			//返回的是影响的记录的条数
			int n = stmt.executeUpdate(sqlC);
			System.out.println(n);
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
