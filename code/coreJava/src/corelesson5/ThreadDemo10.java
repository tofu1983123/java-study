package corelesson5;

public class ThreadDemo10 {
	public static void main(String[] args) {
		Data1 data1 = new Data1();
		//产生了数据共享的问题
		Thread t1 = new Thread(data1);
		Thread t2 = new Thread(data1);
		t1.start();
		t2.start();
		
	}
}
class Data1 implements Runnable{
	private int i;
	public synchronized void run() {
		int h;
		for(int j = 1;j <= 10;j++){
			h = i + 1;
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i = h;				
			System.out.println(i);
		}
	}
}