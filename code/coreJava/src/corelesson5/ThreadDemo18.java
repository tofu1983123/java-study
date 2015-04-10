package corelesson5;

import java.util.Random;

public class ThreadDemo18 {

	public static void main(String[] args) {
		final Business1 business = new Business1();
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				for(int i = 1;i <= 50;i++){
					business.a();
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				for(int i = 1;i <= 50;i++){
					business.b();
				}
			}
		});
		Thread t3 = new Thread(new Runnable(){
			public void run() {
				for(int i = 1;i <= 50;i++){
					business.c();
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}
}
class Business1{
//	private boolean flag;
//	//模拟生产者
//	public void a(){
//		synchronized (this) {
//			while(flag){
//				try {
//					this.wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			for(int j = 1;j <= 10;j++){
//				System.out.println("A线程循环"+j+"次");
//			}
//			flag = true;
//			this.notify();
//			
//		}
//	}
//	//模拟消费者
//	public void b(){
//		synchronized (this) {
//			while(!flag){
//				try {
//					this.wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			for(int j = 1;j <= 20;j++){
//				System.out.println("B线程循环"+j+"次");
//			}
//			flag = false;
//			this.notify();
//		}
//	}
	private int flag = 1;
	public void a(){
		synchronized (this) {
			while(flag != 1){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for(int j = 1;j <= 10;j++){
				System.out.println("A线程循环"+j+"次");
			}
			flag = 2;
			this.notifyAll();
			
		}
	}
	public void b(){
		synchronized (this) {
			while(flag != 2){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for(int j = 1;j <= 20;j++){
				System.out.println("B线程循环"+j+"次");
			}
			flag = 3;
			this.notifyAll();
		}
	}
	public void c(){
		synchronized (this) {
			while(flag != 3){
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for(int j = 1;j <= 30;j++){
				System.out.println("C线程循环"+j+"次");
			}
			flag = 1;
			this.notifyAll();
		}
	}
}