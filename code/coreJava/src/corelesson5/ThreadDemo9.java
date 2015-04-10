package corelesson5;

public class ThreadDemo9 {
	public static void main(String[] args) {
		Data data = new Data();
		//产生了数据共享的问题
		Thread t1 = new Thread(data);
		Thread t2 = new Thread(data);
		t1.start();
		t2.start();
		
	}
}
class Data implements Runnable{
	private int i;
	public void run() {
		int h;
		for(int j = 1;j <= 10;j++){
			synchronized (this) {
				h = i + 1;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				i = h;				
			}//出同步块,就是释放锁的钥匙.
			System.out.println(i);
		}
	}
}