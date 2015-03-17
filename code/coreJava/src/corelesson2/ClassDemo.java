package corelesson2;

public class ClassDemo {

	public static void main(String[] args) {
		A a1 = new A();
		/*��ʾ��A���������---->A�౾��Ҳ��һ������
		 * ����һ��:Ҳ������Ϊ���ֽ���(�Լ������)
		 * */
		Class c1 = A.class;//�κ�һ���඼��һ�������ľ�̬�ĳ�Ա����class
		Class c2 = a1.getClass();
		//c1,c2����ʾ��һ������,����������A�����
		System.out.println(c1 == c2);//true
		/*
		 * һ�������Class���һ������
		 * ���ǰ���������Ϊ���������,Ҳ��Ϊ����ֽ���
		 * ������c1,c2��������A���������
		 * */
		Class c3 = null;
		try {
			/*���ֱ�ʾ��ʽҲ�����˶�̬������
			 * ��̬��������ָ������ʱ�̼�����
			 * ���Ǳ���ʱ��
			 * */
			c3 = Class.forName("corelesson2.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c2 == c3);//true
		/*�����ܲ���ֱ��ͨ��������,ֱ�ӻ�ȡ��Ķ���
		 * ͨ��c1,c2 or c3ֱ�ӻ�ȡA��Ķ��� 
		 * */
		try {
			/*�����޲����Ĺ��췽������������
			 * ����Object��Ҫ��ǿ������ת��
			 * */
			A aa = (A)c1.newInstance();
			aa.test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=======================");
		//test(new A());
		test("hello");
		System.out.println("=======================");
		//String �����������α�ʾ
		Class cc1 = String.class;
		Class cc2 = "hello".getClass();
		Class cc3 = null;
		try {
			cc3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cc1 == cc2);//true
		System.out.println(cc2 == cc3);//true
	}
	public static void test(Object obj){
		//���ݵ����ĸ��������,��ȡ�ľ����������������
		Class c = obj.getClass();
		//��ȡ����
		System.out.println(c.getName());
	}
}
class A{
	void test(){System.out.println("hello");}
}