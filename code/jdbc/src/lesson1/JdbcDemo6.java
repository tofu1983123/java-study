package lesson1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo6 {
	public static void main(String[] args) {
		try {
			Connection con = JdbcUtil.getConn();
			/*Statement stmt = con.createStatement();
			String name = "zhangsan";
			//����������������������ֵ,��ôƴ�Ӻ��sql�������
			//String pass = "123' or 'a' = 'a";
			//
			// sql���ƴ�Ӻ�����:
			// select * from bbs_user where username='zhangsan' and userpass='123' or 'a' = 'a'
			// �����
			// ��ʵ����������û�,�����������ļ�¼,������Sqlע��.
			String pass = "12344";
			String sql = "select * from bbs_user where username='"+name+"' and userpass='"+pass+"'";
			//System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs.next());*/
			String name = "zhangsanxxx";
			String pass = "123' or 'a' = 'a";
			PreparedStatement pstmt = con.prepareStatement("select * from bbs_user where username = ? and userpass = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			ResultSet rs = pstmt.executeQuery();
			System.out.println(rs.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
