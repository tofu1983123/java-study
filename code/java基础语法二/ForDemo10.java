/*
	��ӡ100��1000֮�����������
	˼·:��Ҫ��ѭ������100��1000֮�����е�����
		Ȼ��һ��һ���ó���,�жϸ������Ƿ�Ϊ����
		for(int n = 100;n <= 1000;n++)
		���Ǵ���2��ż������������---> ��Ϊ����2��ż����������2
		for(int n = 101;n < 1000;n += 2)

		ÿ����������л���
*/
import java.util.Scanner;
class ForDemo10
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int n = 101;n < 1000;n += 2){//n��ʵ�ʹ�����101��1000
			//�õ�n,�ж�n�Ƿ�Ϊ����
			int i;
			for(i = 2;i <= n/2;i++){
				if(n % i == 0)
					break;
			}
			if(i > n/2){//������ ��ӡ ������
				count++;
				System.out.print(n+" ");
				if(count % 5 == 0){
					System.out.println();//����
				}
			}
		}
	}
}