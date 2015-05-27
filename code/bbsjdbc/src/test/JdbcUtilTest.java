package test;

import java.sql.Connection;

import cn.wyzc.bbs.util.JdbcUtil;

public class JdbcUtilTest {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getConn();
		System.out.println(con);
	}
}
