package corelesson5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo23 {
	public static void main(String[] args) {
		//������һ���̶������̳߳�.
		//ExecutorService threadPool = Executors.newFixedThreadPool(3);
		//������һ����һ���߳�
		//ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//Ĭ�ϴ���10���̵߳��̳߳�
		ExecutorService threadPool = Executors.newCachedThreadPool();
		for(int i = 1;i <= 10;i++){
			final int task = i;
			threadPool.execute(new Runnable(){
				public void run() {
					for(int j = 1;j <= 10;j++){
						System.out.println(Thread.currentThread().getName()+"ִ�е�"+task+"������ĵ�"+j+"��ѭ��");
					}
				}
			});
		}
		threadPool.shutdown();
	}

}
