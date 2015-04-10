package corelesson5;

import java.util.Random;

public class ThreadDemo17 {

	public static void main(String[] args) {
		Send send = new Send();
		Rec rec = new Rec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		t1.start();
		t2.start();
	}
}
class Send implements Runnable{
	boolean flag;
	int theValue;
	public void run() {
		for(int i = 1;i <= 50;i++){
			synchronized(this){
				while(flag){
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for(int j = 1;j <= 10;j++){
					System.out.println("A线程循环"+j+"次");
				}
				//自己去等待
				flag = true;
				//唤醒消费者
				this.notify();
			}
		}		
	}
}
class Rec implements Runnable{
	private Send send;
	public Rec(Send send) {
		super();
		this.send = send;
	}
	public void run() {
		//不知道生产者生产多少食物,生产多少消费多少
		for(int i = 1;i <= 50;i++){
			synchronized (send) {
				while(!send.flag){
					try {
						send.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				for(int j = 1;j <= 20;j++){
					System.out.println("B线程循环"+j+"次");
				}
				//自己去等待
				send.flag = false;
				send.notify();
			}
		}
	}	
}