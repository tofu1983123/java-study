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
	 * �����˻���ҵ��
	 * @param account
	 */
	public void addAccount(Account account){
		//���������:��Ҫ����---->Ȼ������һ����¼
	}
	/**
	 * ת�˵�ҵ��
	 * @param id1
	 * @param id2
	 * @param money
	 */
	public void changeAccount(int id1,int id2,int money){
		Connection con = null;
		try {
			con = JdbcUtil.getConn();
			//��������
			con.setAutoCommit(false);
			Account account1 = ad.findById(id1);
			Account account2 = ad.findById(id2);
			int n1 = ad.updateAccount(id1, account1.getMoney()-money);
			if(flag)
				throw new RuntimeException("���ܳ�����ĳ���쳣");
			int n2 = ad.updateAccount(id2, account2.getMoney()+money);
			//�ύ����
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//�ع�����
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally{
			//�ر�Connection
			JdbcUtil.closeConnection();
		}
	}
}
