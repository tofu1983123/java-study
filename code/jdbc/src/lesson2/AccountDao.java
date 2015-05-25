package lesson2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	public int addAccount(Account account){
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			String sql = "insert into account(id,money,name) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, account.getId());
			pstmt.setInt(2, account.getMoney());
			pstmt.setString(3, account.getName());
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt,null);
		}
		return n;
	}
	public Account findById(int id){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Account account = null;
		try {
			con = JdbcUtil.getConn();
			
			String sql = "select * from account where id ="+id;
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()){
				account = new Account();
				account.setId(rs.getInt("id"));
				account.setMoney(rs.getInt("money"));
				account.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return account;
	}
	public List<Account> getAllAccount(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Account> accounts = new ArrayList<Account>();
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement("select id,money,name from account");
			rs = pstmt.executeQuery();
			while(rs.next()){
				Account account = new Account();
				account.setId(rs.getInt("id"));
				account.setMoney(rs.getInt("money"));
				account.setName(rs.getString("name"));
				accounts.add(account);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return accounts;
	}
	public int updateAccount(int id,int money){
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			String sql = "update account set money = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, money);
			pstmt.setInt(2, id);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, null);
		}
		return n;
	}
}
