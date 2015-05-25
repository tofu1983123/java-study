package lesson2.proxyaccount;

import java.util.List;

import lesson2.Account;

public interface AccountService {
	/**
	 * �����˻�
	 * @param account
	 * @return
	 */
	public int addAccount(Account account);
	/**
	 * ת��
	 * @param id1
	 * @param id2
	 * @param money
	 */
	public void changeAccount(int id1,int id2,int money);
	/**
	 * ��ѯ�����˻�
	 */
	@Support
	public List<Account> getAll();	
}
