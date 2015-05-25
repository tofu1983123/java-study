package lesson3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test2 {

	public static void main(String[] args) {
		String sql = "create table tt(id int auto_increment primary key,name varchar(10),pass varchar(10))";
		String sql1 = "insert into tt(name,pass) values(?,?)";
		String sql2 = "select * from tt";
		try {
			Connection con = JdbcUtil.getConn();
			//PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt = con.prepareStatement(sql2);
			//pstmt.setString(1, "xxx");
			//pstmt.setString(2, "yyy");
			boolean flag = pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			if(rs.next()){
				System.out.println(rs.getString(2));
			}
			System.out.println(flag);//返回false,因为没有结果集对象,但表已创建.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
