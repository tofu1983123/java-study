package corelesson8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class GenericDemo {
	public static void main(String[] args) {
		//����ֻ�ڱ���׶���Ч---->���Ҳο������½�
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		ArrayList list1 = new ArrayList();
		System.out.println(list.getClass() == list1.getClass());
		System.out.println("==========================");
		//���������Ϳ�������ԭʼ����
		ArrayList<String> obj1 = new ArrayList();//���Ե�---->������Ϣ
		obj1.add("hello");
		//obj1.add(100);//�ڱ���׶�ֻ�ܷ���String����
		//ԭʼ���Ϳ������ò���������
		ArrayList obj2 = new ArrayList<String>();//���Ե�---->������Ϣ
		obj2.add("hello");
		obj2.add(100);
		System.out.println("==========================");
		//�����������Ͳ����Ǽ̳й�ϵ.
		//ArrayList<Object> obj = new ArrayList<String>();������
		//ArrayList<String> obj = new ArrayList<Object>();������
		Vector v1 = new Vector<String>();
		Vector<Object> v = v1;
		System.out.println("==========================");
		print(list);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		print(hs);
		//����ʵ������ʱ��,������Number or ������
		Vector<? extends Number> x = new Vector<Integer>();
		//Vector<? extends Number> y = new Vector<Object>();//�����
		//ʵ������ʱ�������Integer�ĸ������Integer ͨ������ǰ����Լ�
		Vector<? super Integer> x1 = new Vector< Number>();
		Vector<? super Integer> x2 = new Vector< Integer>();
		System.out.println("==========================");
		print(10,10);//print(int a,int b);
		print(10.5,10.5);//print(double a,double b);
		System.out.println("==========================");
		B<Integer> b = new B<Integer>(10,10);
		b.print();
		B<String> b1 = new B<String>("hello","world");
		b1.print();
		System.out.println("==========================");
		C<Integer,String> c = new C<Integer,String>(10,"hello");
		C<Double,Double> c1 = new C<Double,Double>(10.1,10.2);
	}
	public static void print(Collection<?> collection){
		//�����ڲ�ֻ�ܵ��ø������޹صķ���
		System.out.println(collection.size());
		//collection.add("hello");//add���������Ƿ��͵�,���Բ�����.
	}
	public static <T> void print(T a,T b){
		System.out.println(a+","+b);
	}
}
interface Dao<T>{
	public T findById();
	public List<T> findAll();
}
class DaoSupport<T> implements Dao<T>{
	public T findById() {
		// TODO �Զ����ɵķ������
		return null;
	}
	public List<T> findAll() {
		List<T> list = new ArrayList<T>();
		return list;
	}
}
class UserDao extends DaoSupport<User>{
	
}
class XXDao extends DaoSupport<String>{
	
}
class B<T>{
	T a,b;
	public B(T a,T b){
		this.a = a;
		this.b = b;
	}
	public void print(){
		System.out.println(a+","+b);
	}
}
class C<T,E>{
	private T a;
	private E b;
	public C(T a,E b){}
	public void print(T a,E b){
		System.out.println(a+","+b);
	}
}