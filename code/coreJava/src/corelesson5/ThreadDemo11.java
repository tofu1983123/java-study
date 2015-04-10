package corelesson5;

public class ThreadDemo11 {
	public static void main(String[] args) {
		final Output output = new Output();
		//final Output output1 = new Output();
		new Thread(new Runnable(){
			public void run() {
				while(true){
					output.print("hello");
				}
			};
		}).start();
		new Thread(new Runnable(){
			public void run() {
				while(true){
					output.print1("WORLD");
				}
			};
		}).start();
	}
}
class Output{
	public void print(String name){
		synchronized (this) {
			for(int i = 0;i < name.length();i++){
				System.out.print(name.charAt(i));
			}
			System.out.println();
		}
	}
	//测试普通方法的锁对象到底是那个对象?---->当前对象
	public synchronized void print1(String name){
		for(int i = 0;i < name.length();i++){
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	//静态方法的锁对象是类类型 Output.class
	public static synchronized void print2(String name){
		for(int i = 0;i < name.length();i++){
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
	public void print3(String name){
		synchronized (this) {
			for(int i = 0;i < name.length();i++){
				System.out.print(name.charAt(i));
			}
			System.out.println();
		}
	}
}