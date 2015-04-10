package corelesson5;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				System.out.println("hello");
			}
		});
		System.out.println(t1.getName());
		t1.setName("线程1");
		System.out.println(t1.getName());
		//获得当前线程,并打印线程的名称
		System.out.println(Thread.currentThread().getName());
		//获取线程的优先级,如果线程没有设置优先级,默认是5级.只能是1级到10级之间.
		System.out.println(t1.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
	}

}
