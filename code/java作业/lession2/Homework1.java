/*
	����һ��������ʽ�ֽ�
	������90�õ�90 = 2*3*3*5
		  80�õ�80 = 2*2*2*2*5

	90 / 2 ===> ��� 2 *
	45 / 3 ===> ��� 3 *
	15 / 3 ===> ��� 3 *
	5������===> ��� 5 

*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		///*����1
		Scanner s = new Scanner(System.in);
		System.out.print("������һ������:");
		int n = s.nextInt();
		int i;
		System.out.print(n + " = ");
		for(i = 2;i <= n;){//��2��ʼ�������������ж�����
			if(n % i == 0){//�ҵ�����������
				System.out.print(i);//��ӡ����
				n = n / i;//�����ֽ� �����������ӵõ���
				if(n != 1)//�ж��Ƿ�Ϊ���һ������,���Ǿʹ�ӡ�˺�
					System.out.print("*");
			}else{
				i++;
			}
		}
		//*/
		/*����2
		Scanner s = new Scanner(System.in);
		System.out.print("������һ������:");
		int n = s.nextInt();
		int i;
		int divisor = 2;
		System.out.print(n + " = ");
		while(n > 1){
			for(i = 2;i <= n;i++){//��2��ʼ�������������ж�����
				if(n % i == 0){//�ҵ�����������
					divisor = i;
					System.out.print(i);//��ӡ����
					break;
				}
			}
			n = n / divisor;//�����ֽ� �����������ӵõ���
			if(n != 1)
				System.out.print("*");
		}
		*/
	}
}
