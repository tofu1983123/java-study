package corelesson5;

public class ThreadDemo1 {

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();//�����߳�
		//������������һ���߳�,����ϰ�߳�Ϊ���߳�
		for(;;){
			System.out.println("world");
		}
		/*
		 * �۲����н��,��������,�����߳���ͬʱ����.
		 * ��ʵ:t1�����߳����л�����.
		 * cpu�ڵ�ʱ��ֻ����һ���߳�(�����߳�ͬʱ����,
		 * ��ʵ���߳����л�����),���۸о��ܶ��߳�
		 * ��ͬʱ����,����Ϊ,���۸о���ʱ���cpu��˵�Ѿ��ܳ���
		 * */
	}
}
class A implements Runnable{
	public void run() {//�߳�Ҫִ�е�����
		for(;;){
			System.out.println("hello");
		}
	}
}