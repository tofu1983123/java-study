import java.util.Scanner;
class IfDemo8
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("�����뿼�Գɼ�:");
		int score = s.nextInt();
		if(score > 100||score < 0)
			System.out.println("�ɼ����벻�Ϸ�");
		else if(score>=90)//90��100
			System.out.println("�ɼ�����");
		else if(score >= 80)
			System.out.println("�ɼ�����");
		else if(score>=70)
			System.out.println("�ɼ�һ��");
		else if(score>=60)
			System.out.println("�ɼ�����");
		else
			System.out.println("�ɼ�������");
	}
}
