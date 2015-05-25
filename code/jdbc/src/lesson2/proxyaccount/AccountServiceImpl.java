package lesson2.proxyaccount;

import java.util.List;

import lesson2.Account;
import lesson2.AccountDao;

public class AccountServiceImpl implements AccountService{
	private AccountDao adDao = new AccountDao();
	private boolean flag = true;
	public int addAccount(Account account) {
		int n = adDao.addAccount(account);
		return n;
	}

	public void changeAccount(int id1, int id2, int money) {
		Account account1 = adDao.findById(id1);
		Account account2 = adDao.findById(id2);
		//省略了一些,不存在用户,余额不足的处理
		int n1 = adDao.updateAccount(id1, account1.getMoney()-money);
		/*if(flag){//模拟出错的情况
			throw new RuntimeException("未知错误");
		}*/
		int n2 = adDao.updateAccount(id2, account2.getMoney()+money);
	}
	
	public List<Account> getAll() {
		List<Account> accounts = adDao.getAllAccount();
		return accounts;
	}
	
}
