package corelesson5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo25 {
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run() {
				System.out.println("hello");
			}
		}).start();
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		threadPool.execute(new Runnable(){
			public void run() {
				System.out.println("bye-bye");
			}
		});
		threadPool.shutdown();
		/*
		 * ����ǰ��������ִ��������run������ʵ�ֵ�����
		 * run������û�з���ֵ��.
		 * ���ǲ���֪���߳�ʲôʱ��ִ�н���.
		 * ����߳�ִ�������ܷ���һ��ֵ,��ô���Ǿ�֪���߳��Ѿ����н�����.
		 * java5���ṩ���߳�ִ������,����ִ���귵�ؾ����ֵ.
		 */
		System.out.println("======================");
		ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
		//Callable<T> ���͵ľ������;��Ƿ���ֵ������ Ҳ������Future�ķ��͵�����
		Future<Integer> future = threadPool1.submit(new Callable<Integer>(){
			public Integer call() throws Exception {
				System.out.println("����ʼ");
				Thread.sleep(3000);
				System.out.println("�������");
				return 10;
			}
		});
		int value = 0;
		try {
			value = future.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(value);
	}	
}
