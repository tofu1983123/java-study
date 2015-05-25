package lesson2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class JdbcDemo6 {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		java.sql.Date date1 = new java.sql.Date(date.getTime());
		try {
			Connection con = JdbcUtil.getConn();
			PreparedStatement pstmt = con.prepareStatement("insert into datetest values(?,?)");
			pstmt.setInt(1, 3);
			//pstmt.setDate(2, date);//´í
			//pstmt.setDate(2, date1);
			//pstmt.setString(2, "09-5ÔÂ-15");
			//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			//String formatDate = sdf.format(date);
			pstmt.setString(2, "03-3ÔÂ-2015");
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
