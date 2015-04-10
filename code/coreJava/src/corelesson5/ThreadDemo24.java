package corelesson5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadDemo24 {

	public static void main(String[] args) {
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(1);
		threadPool.scheduleAtFixedRate(new Runnable(){
			public void run() {
				System.out.println("±¨’®¡À...");
			}
		}, 0, 2,TimeUnit.SECONDS);
	}

}
