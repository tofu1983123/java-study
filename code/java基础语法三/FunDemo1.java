/*
	ͨ����������������,�ֱ��ӡ���ǵ�����(�������Լ�)
*/
import java.util.Scanner;
class FunDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = s.nextInt();
		for(int i = 1;i <= a/2;i++){
			if(a%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("������ڶ�������:");
		int b = s.nextInt();
		for(int i = 1;i <= b/2;i++){
			if(b%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("���������������:");
		int c = s.nextInt();
		for(int i = 1;i <= c/2;i++){
			if(c%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		/*�ظ������ι���,���������̶��Ǵ�ӡһ�����ֵ�����
		������ظ��Ĺ�����������,ÿ���õ�ʱ��,���ظ�����
		�������,ֻ�������������Ҫ�и�����,�������ڵ�a,b,c,
		�������Ǵ�������һ������,��ô������̾�������˵��
		����,���߽� ����.*/
	}
}
