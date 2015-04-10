package corelesson5;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				try {
					Thread.sleep(100000);
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println(Thread.currentThread().getName()+"œﬂ≥Ãsleep÷–∂œ");
				}
				System.out.println("helloworld");
			}
		});
		t1.start();
		for(int i = 1;i <= 10;i++){
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
		}
		t1.interrupt();
	}

}
