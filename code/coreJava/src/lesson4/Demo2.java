package lesson4;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * ���´���д��֮��,������ͨ��
		 * һ�������쳣,�ͻ����һ���쳣�Ķ���
		 * Ҳ�����Լ�����
		 * */
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ��!");
		} catch (ArithmeticException e){
			System.out.println("��������Ϊ0!");
		}
		
	}
}