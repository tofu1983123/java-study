/*
	����һ������,�������ֵ���
	����1234�õ�4321
	˼·:1.�Ȼ�ȡ�õ�4
		 2.n=n/10�������10������0(˵��ǰ����λ��)
		 3.4*10+3===>(ȡ���ڵĸ�λ) n = n/10 --->12(��������0)
		 4.43*10+2===>(ȡ���ڵĸ�λ) n = n/10 --->1(��������0)
		 5.432*10+1===>(ȡ���ڵĸ�λ) n = n/10 (����0,ѭ������)
	�ܽ�:��� ���������sum
		 sum*10+��λ
		 n = n/10;
*/
import java.util.Scanner;
class WhileDemo3 
{
	public static void main(String[] args) 
	{
		/*int a = 123;
		System.out.print(a%10);
		System.out.print(a/10%10);
		System.out.print(a/100);*/
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������");
		int n = s.nextInt();
		int t = n;
		int reverseNumber = 0;
		while(n != 0){
			reverseNumber = reverseNumber*10 + n%10;
			n = n/10;
		}
		System.out.println(t+"���ú���:"+reverseNumber);



	}
}
