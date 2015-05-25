package lesson2.proxyaccount;

import java.util.List;

import lesson2.Account;

public class AccountTest {
	public static void main(String[] args) {
		AccountServiceImpl accountService = new AccountServiceImpl();
		ProxyFactoryBean pfb = new ProxyFactoryBean(accountService);
		AccountService accountServiceProxy = (AccountService)pfb.getProxy();
		accountServiceProxy.changeAccount(1001, 1002, 1000);
		//Account account  = new Account(1006,200,"zhaoliu");
		//accountServiceProxy.addAccount(account);
		/*List<Account> accounts = accountServiceProxy.getAll();
		for (Account account : accounts) {
			System.out.println(account);
		}*/
	}
}
