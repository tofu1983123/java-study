package lesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private static Properties prop = new Properties();
	static {
		try {
			prop.load(JdbcUtil.class
					.getResourceAsStream("/database.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		try {
			Class.forName(prop.getProperty("driverClass"));
			Connection con = DriverManager.getConnection(
					prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("pass"));
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void close(Connection con,Statement stmt,ResultSet rs){
		if(rs != null)
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		if(stmt != null)
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		if(con != null)
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
