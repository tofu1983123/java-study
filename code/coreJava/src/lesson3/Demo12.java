package lesson3;

public class Demo12 {

	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.test3();
		System.out.println("=============");
		Outer1.Inner inner = new Outer1.Inner();
		inner.innertest();
		System.out.println("=============");
		inner.innertest2();
	}
}
class Outer1{
	public void test1(){
		System.out.print("hello");
	}
	public static void test2(){
		System.out.print("hello");
	}
	public void test3(){
		Inner inner = new Inner();//�ڳ�Ա������ֱ��ʹ��
		inner.innertest();
	}
	//��̬�ڲ��� ----> �ȼ��ھ�̬��Ա
	static class Inner{
		public void innertest(){
			System.out.println("innertest1");
		}
		//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա ---->��̬��ֻ�ܷ��ʾ�̬��
		public void innertest2(){
			test2();
		}
	}
}