/*
	��֪faibonacci(�Ѳ�����)���е�ǰ�������ֱ�Ϊ0,1,1,2,3,5,�� ����
	�ӵ�3�ʼ��ÿһ�����ǰ����ĺ͡�
	����һ������n�������������е�ǰn��ĺ͡�
	ע�⣺����������Ǵ�0��ʼ�ġ�
	0 1 1 2 3 5 8 13 ��
	����:
	��������������5,��ô������ǰ5��ĺ�
	ǰһ��sum = 0			= 0  sum + sum
	ǰ����sum = 0+1         = 1  sum + sum
	ǰ����sum = 0+1+1       = 2  sum + sum ��n�� = n-2�� + n-1�� ǰn��ĺ� = ��n�� + ǰn-1��ĺ�
											 3       1(0)+   2(1)          =       + (b + a)
											 4       2(1)+   3(1)          
											 5       3(1)+   4(2)
	ǰ����sum = 0+1+1+2     = 4     
	ǰ����sum = 0+1+1+2+3   = 7
*/
import java.util.Scanner;
class Homework5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("������Ѳ��������е�����n(n>0):");
		int n = s.nextInt();
		int sum = 0;//��ʾǰn��ĺ�
		int a = 0;//��ʾn-2��
		int b = 1;//��ʾn-1��
		int c = 0;//��ʾ��n��
		if(n > 2){
			sum = a + b;
			System.out.print("�Ѳ��������еĸ���Ϊ:");
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i = 2;i < n;i++){
				c = a + b;
				a = b;
				b = c;
				System.out.print(c+" ");
				sum = sum + c;
			}
		}else if(n == 1){
			sum = a;
			System.out.print("�Ѳ��������еĸ���Ϊ:");
			System.out.print(a+" ");
		}else if(n == 2){
			sum = a + b;
			System.out.print("�Ѳ��������еĸ���Ϊ:");
			System.out.print(a+" ");
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("�Ѳ���������ǰ"+n+"��ĺ���:"+sum);
	}
}
