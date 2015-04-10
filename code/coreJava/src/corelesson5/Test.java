package corelesson5;

public class Test {
	//采用Runnable接口方式创建的多条线程可以共享实例属性
    private int i;
    //同步增加方法
    private synchronized void inc(){
       i++;
       System.out.println(Thread.currentThread().getName()+ "...inc..." + i);
    }
    //同步减算方法
    private synchronized void dec(){
       i--;
       System.out.println(Thread.currentThread().getName()+ "...dec..." + i);
    }
    //增加线程
    class Inc implements Runnable{
       public void run(){
           inc();
       }
    }
    //减算线程
    class Dec implements Runnable{
       public void run(){
           dec();
       }
    }
    public static void main(String[] args){
       Test tt = new Test();
       //内部类的实例化
       Inc inc = tt. new Inc();
       Dec dec = tt. new Dec();
       //创建 2*n 个线程 此处 n=2
       for(int i = 0;i < 2;i++){
           new Thread(inc).start();
           new Thread(dec).start();
       }
    }
}
