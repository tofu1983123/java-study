import java.util.Scanner;
class StringDemo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������:");
		int a = s.nextInt();//��������,�����0��ͷ,0�ᱻ�Զ�ȥ��
		System.out.println(a);
		System.out.println("������һ���ַ���:");
		String str1 = s.next();
		System.out.println(str1);

		int b = 123;//����123
		String str2 = "123";//�ַ���123
		String.out.println(b+str2);//��ӡ���Ϊ 123123
		//���ϣ����һ���ַ�������ת�����������͵�����
		int c = Integer.parseInt(str2);//�������ַ���ת������������
		System.out.println(b+c);//��ӡ���Ϊ 246
	}
}
