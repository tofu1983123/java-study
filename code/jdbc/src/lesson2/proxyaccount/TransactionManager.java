package lesson2.proxyaccount;

import java.sql.Connection;
import java.sql.SQLException;

import lesson2.JdbcUtil;

public class TransactionManager {
	public static void begin() throws SQLException{
		Connection con = JdbcUtil.getConn();
		con.setAutoCommit(false);
	}
	public static void commit() throws SQLException{
		Connection con = JdbcUtil.getConn();
		con.commit();
	}
	public static void rollback() throws SQLException{
		Connection con = JdbcUtil.getConn();
		con.rollback();
	}
}
