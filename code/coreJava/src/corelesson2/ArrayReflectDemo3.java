package corelesson2;

import java.lang.reflect.Method;

public class ArrayReflectDemo3 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		Integer[] b = {1,2,3,4};
		Object o1 = a;//ok
		//Object[] o2 = a;//����
		Object o2 = b;//ok �����鵱����һ������
		Object[] o3 = b;//ok �������ÿһ��Integer��������
		String[] s = {"hello","world"};
		String[][] ss = {{"aa","bb"},{"cc","dd"}};
		Object o4 = ss;//ok ��������ά���鿴����һ������
		Object[] o5 = ss;//ok �����е�ÿһ��һά���鵱��һ������
		Object[][] o6 = ss;//ok �����е�ÿ���ַ�������һ������
		MainTest.main(new String[]{"hello","world"});
		
		Object[] o = new String[]{"hello","world"};
		Object oo = new String[]{"hello","world"};
		//ͨ��main�����ķ���������
		try {
			Method m = MainTest.class.getMethod("main", new Class[]{String[].class});
			//m.invoke(null, new Object[]{new String[]{"hello","world"}});
			//�õ�����Ĭ����ΪObject���͵�һά����,��������ᱨ��
			m.invoke(null, new String[]{"hello","world"});
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class MainTest{
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
}