package lesson2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JdbcDemo5 {

	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			PreparedStatement pstmt = con.prepareStatement("insert into t values(?)");
			for(int i = 1;i <= 1000;i++){
				pstmt.setInt(1, i);
				pstmt.addBatch();
				if(i % 10 == 0){//每10条记录执行一次插入
					pstmt.executeBatch();
					pstmt.clearBatch();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
