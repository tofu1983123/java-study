import java.util.Scanner;
class FunDemo2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ������:");
		int x1 = s.nextInt();
		//��ӡx1������ ===>��ӡ�����Ѿ�д���˺���,ֱ�ӵ��ü���
		printSons(x1);//���ú���
		System.out.println("������ڶ�������:");
		int x2 = s.nextInt();
		//��ӡx2������,---->��ӡ����,ֱ�ӵ��ú�������
		printSons(x2);
		System.out.println("���������������:");
		int x3 = s.nextInt();
		//��ӡx3������,---->��ӡ����,ֱ�ӵ��ú�������
		printSons(x3);
	}
	public static void printSons(int a){
		//����˴�ӡa������
		for(int i = 1;i < a/2;i++){
			if(a%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
