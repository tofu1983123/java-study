/*
	����һ����������(��1),��ӡ����������,����1�������Լ�
	���������������
	˼·:��ô��ӡ����,��Ҫ��ȡ������,���Ӿ����ܱ�������������
		 �õ����־Ϳ�ʼ��,��1��ʼһֱ����n-1���û��������������
		 ����ѭ��������for(int i=1;i<n;i++)
		 ����һ�����ֳ��Դ����Լ�һ�����(�������Լ�)�϶�������
		 ����ѭ���������Լ���for(int i=1;i <= n/2;i++)
*/
import java.util.Scanner;
class ForDemo7 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("����������:");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1;i <= n/2;i++){
			if(n % i == 0){//û������,������
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("���ӵĺ���:"+sum);
	}
}
