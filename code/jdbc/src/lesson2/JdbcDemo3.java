package lesson2;

public class JdbcDemo3 {

	public static void main(String[] args) {
		AccountService service = new AccountService();
		service.setFlag(false);
		service.changeAccount(1001, 1002, 1000);
	}

}
