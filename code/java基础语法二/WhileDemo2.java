/*
	������һ������,Ҫ�����������λ֮��
	��������123 �ͼ���1+2+3 ����6.
	˼·:
		����1234
		��ȡ����λ4,%10 �͵õ��ۼ�
		Ȼ�����10 ��ȡ����λ%10 �ۼ�
		...
		ʣ��1   ��ȡ����λ %10 �ۼ�
		�ٳ�10��Ϊ0,˵���Ѿ�û��λ����,����
*/
import java.util.Scanner;
class WhileDemo2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������");
		int n = s.nextInt();
		int t = n;
		int sum = 0;//��ź�
		while(t != 0){
			sum = sum + t % 10;
			t = t / 10;
		}
		System.out.println(n+"�ĸ�����λ֮����:"+sum);
	}
}
