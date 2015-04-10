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
					System.out.println("A�߳�ѭ��"+j+"��");
				}
				//�Լ�ȥ�ȴ�
				flag = true;
				//����������
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
		//��֪����������������ʳ��,�����������Ѷ���
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
					System.out.println("B�߳�ѭ��"+j+"��");
				}
				//�Լ�ȥ�ȴ�
				send.flag = false;
				send.notify();
			}
		}
	}	
}