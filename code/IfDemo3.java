import java.util.Scanner;
class IfDemo3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int a = s.nextInt();
		System.out.println("������ڶ������֣�");
		int b = s.nextInt();
		System.out.println("��������������֣�");
		int c = s.nextInt();
		/*˼·������һ������ר�Ŵ�����ֵ,��������һ��
		  ����max��Ȼ������������Ƚ�
		  1.���ڼ���max=a;
		  2.��ô����max�Ⱥ�b�Ƚϣ������b��max���䣬�����bС��
			��ômaxΪb��a,b�д�ķ�����max�С�
		  3.����max��c�ȣ������c��max���䣬�����cС��maxֵ��Ϊc��ֵ
		*/
		int max = a;
		if(max < b)
			max = b;//a b �д�ķ�����max�С�
		if(max < c)
			max = c;//a b c�����ķ�����max�С�
		System.out.println(a+","+b+","+c+"�����ֵΪ:" + max);
	}
}
