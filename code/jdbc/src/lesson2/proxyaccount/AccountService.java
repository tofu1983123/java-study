package lesson2.proxyaccount;

import java.util.List;

import lesson2.Account;

public interface AccountService {
	/**
	 * 增加账户
	 * @param account
	 * @return
	 */
	public int addAccount(Account account);
	/**
	 * 转账
	 * @param id1
	 * @param id2
	 * @param money
	 */
	public void changeAccount(int id1,int id2,int money);
	/**
	 * 查询所有账户
	 */
	@Support
	public List<Account> getAll();	
}
