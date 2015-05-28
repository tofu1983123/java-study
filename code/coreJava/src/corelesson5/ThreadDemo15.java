package corelesson5;

import java.util.Random;

public class ThreadDemo15 {

	public static void main(String[] args) {
		WaitSend send = new WaitSend();
		WaitRec rec = new WaitRec(send);
		Thread t1 = new Thread(send);
		Thread t2 = new Thread(rec);
		//��t2���ó��ػ��߳�,������ֻ���ػ��̵߳�ʱ��,�����Զ�����.
		t2.setDaemon(true);
		t1.start();
		t2.start();
	}
}
class WaitSend implements Runnable{
	boolean flag;
	int theValue;
	public void run() {
		for(int i = 1;i <= 5;i++){
			synchronized(this){
				while(flag){//ΪʲôҪ��while,�����жϺ���ٻ���
					try {//try�������while����
						this.wait();//wait()���ͷ�ͬ����Կ��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//����������ʳ��
				theValue = new Random().nextInt(1000);
				System.out.println("send the value is:" + theValue);
				//�Լ�ȥ�ȴ�
				flag = true;
				//����������
				this.notify();
			}
		}		
	}
}
class WaitRec implements Runnable{
	private WaitSend send;
	public WaitRec(WaitSend send) {
		super();
		this.send = send;
	}
	public void run() {
		//��֪����������������ʳ��,�����������Ѷ���
		while(true){
			synchronized (send) {
				while(!send.flag){
					try {
						send.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//����ʳ��
				System.out.println("receive the value is:" + send.theValue);
				//�Լ�ȥ�ȴ�
				send.flag = false;
				send.notify();
			}
		}
	}	
}