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
		 * 我们前面遇到的执行任务都是run方法来实现的任务
		 * run方法是没有返回值的.
		 * 我们并不知道线程什么时候执行结束.
		 * 如果线程执行完了能返回一个值,那么我们就知道线程已经运行结束了.
		 * java5中提供了线程执行任务,任务执行完返回具体的值.
		 */
		System.out.println("======================");
		ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
		//Callable<T> 泛型的具体类型就是返回值的类型 也决定了Future的泛型的类型
		Future<Integer> future = threadPool1.submit(new Callable<Integer>(){
			public Integer call() throws Exception {
				System.out.println("任务开始");
				Thread.sleep(3000);
				System.out.println("任务结束");
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
