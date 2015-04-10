package corelesson5;

public class ThreadDemo6 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for(int i = 1;i <= 10;i++){
			try {
				t1.sleep(10000);//主线程sleep10秒钟,等价于Thread.sleep(10000);
				//哪个线程执行到sleep方法哪个线程就去sleep.
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("world");
		}
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1;i <= 10;i++){
			System.out.println(i);
		}
	}
}