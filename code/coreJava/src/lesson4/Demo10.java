package lesson4;

public class Demo10 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			/*��������쳣��ArrayIndexOutOfBoundsException������,
			 * �����Ķ���͸�catch��Exception���ͽ�����.
			 * ���������,�����������ʵ��
			 * ���ݵ���ϢҲ�ǿɿ���
			 * */
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e);//e.toString();�쳣����+message
			e.printStackTrace();//�쳣����+message+�쳣�����ĸ�����ĸ�����������
		}

	}

}