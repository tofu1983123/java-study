package lesson4;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * ��һ�д������п��ܲ����쳣��
		 * eclipse��Ȼû����,˵����ͨ������
		 * ˵��������쳣,��ʵjvm�����Զ�����
		 * ��ȻҲ�����Լ�����---->���Ը������Ѻõ���ʾ
		 * */
		try {
			/*
			 * ���ܻ�����쳣�Ĵ���
			 * һ�������쳣,�ͻ����һ���쳣����
			 * */
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�����±�Խ��!");
		}
		/*���±����Լ����������벻ͨ��*/
		//FileInputStream in = new FileInputStream("aa.txt");
		
	}

}
