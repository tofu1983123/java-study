package cn.wyzc.bbs.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JdbcUtil {
	private static Properties prop = new Properties();
	static {
		try {
			prop.load(JdbcUtil.class
					.getResourceAsStream("/database.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn(){
		try {
			Class.forName(prop.getProperty("driver"));
			Connection con = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("name"),
					prop.getProperty("pass"));
			return con;
		} catch (Exception e) {
		   e.printStackTrace();
		   return null;
		}
	}
	public static void close(Statement stmt ,ResultSet rs){
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
		  if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	   
}
