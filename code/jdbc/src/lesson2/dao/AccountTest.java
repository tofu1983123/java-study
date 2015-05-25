package lesson2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import lesson2.Account;

public class AccountTest {
	public static void main(String[] args) {
		DaoSupport<Account> dao = new DaoSupport<Account>();
		//Account account = dao.findById(1001, "select * from account where id = ?", new AccountMapper());
		//System.out.println(account);
		/*List<Account> accounts = dao.find("select * from account", new AccountMapper());
		for (Account account : accounts) {
			System.out.println(account);
		}*/
		Account account = new Account(1004,1000,"xxx");
		int n = dao.saveOrUpdateOrDelete("insert into account(id,money,name) values(?,?,?)", account.getId(),account.getMoney(),account.getName());
		System.out.println(n);
	}
	static class AccountMapper implements RowMapper<Account>{

		public Account getRow(ResultSet rs) throws SQLException {
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setMoney(rs.getInt("money"));
			account.setName(rs.getString("name"));
			return account;
		}
		
	}
}
