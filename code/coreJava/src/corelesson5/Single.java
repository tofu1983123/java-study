package corelesson5;

public class Single {
	private static Single instance = null;
	private Single(){}
	/**
	 * 多线程并发的情况,还能保证单例模式吗?不能
	 * @return
	 */
	public synchronized static Single getInstance(){
		if(instance == null){
			instance = new Single();
		}
		return instance;
	}
	
}
