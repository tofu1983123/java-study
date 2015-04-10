package corelesson5;

public class Test {
	//����Runnable�ӿڷ�ʽ�����Ķ����߳̿��Թ���ʵ������
    private int i;
    //ͬ�����ӷ���
    private synchronized void inc(){
       i++;
       System.out.println(Thread.currentThread().getName()+ "...inc..." + i);
    }
    //ͬ�����㷽��
    private synchronized void dec(){
       i--;
       System.out.println(Thread.currentThread().getName()+ "...dec..." + i);
    }
    //�����߳�
    class Inc implements Runnable{
       public void run(){
           inc();
       }
    }
    //�����߳�
    class Dec implements Runnable{
       public void run(){
           dec();
       }
    }
    public static void main(String[] args){
       Test tt = new Test();
       //�ڲ����ʵ����
       Inc inc = tt. new Inc();
       Dec dec = tt. new Dec();
       //���� 2*n ���߳� �˴� n=2
       for(int i = 0;i < 2;i++){
           new Thread(inc).start();
           new Thread(dec).start();
       }
    }
}
