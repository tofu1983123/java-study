package lesson2;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
	private boolean flag;
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	AccountDao ad = new AccountDao();
	/**
	 * 增加账户的业务
	 * @param account
	 */
	public void addAccount(Account account){
		//如果有密码:需要加密---->然后增加一条记录
	}
	/**
	 * 转账的业务
	 * @param id1
	 * @param id2
	 * @param money
	 */
	public void changeAccount(int id1,int id2,int money){
		Connection con = null;
		try {
			con = JdbcUtil.getConn();
			//开启事务
			con.setAutoCommit(false);
			Account account1 = ad.findById(id1);
			Account account2 = ad.findById(id2);
			int n1 = ad.updateAccount(id1, account1.getMoney()-money);
			if(flag)
				throw new RuntimeException("可能出现了某种异常");
			int n2 = ad.updateAccount(id2, account2.getMoney()+money);
			//提交事务
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//回滚事务
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally{
			//关闭Connection
			JdbcUtil.closeConnection();
		}
	}
}
