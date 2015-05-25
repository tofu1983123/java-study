package lesson3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtil {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(JdbcUtil.class.getResourceAsStream("/lesson3/db.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		try {
			Class.forName(prop.getProperty("driver"));
			Connection con = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("name"),prop.getProperty("pass"));
			return con;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
