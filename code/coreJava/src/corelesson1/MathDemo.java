package corelesson1;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		//��
		System.out.println(Math.floor(10.3));
		System.out.println(Math.floor(10.5));
		//��������
		System.out.println(Math.round(10.3));
		System.out.println(Math.round(10.5));
		//��
		System.out.println(Math.ceil(10.3));
		System.out.println(Math.ceil(10.5));
		
		System.out.println(Math.max(100,1000));
		
		//���ֵ ����0��1ֱ�ӵ�double
		System.out.println(Math.random());
		int a = (int)(Math.random()*100);
		System.out.println(a);
		
	}

}
