package lesson2;

import java.util.List;

public class JdbcDemo2 {
	public static void main(String[] args) {
		AccountDao ad = new AccountDao();
		/*List<Account> accounts = ad.getAllAccount();
		for (Account account : accounts) {
			System.out.println(account);
		}*/
		/*int n = ad.updateAccount(1002, 300);
		System.out.println(n);*/
		Account account = ad.findById(1001);
		System.out.println(account);
	}
}
