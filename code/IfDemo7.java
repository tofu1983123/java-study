import java.util.Scanner;
class IfDemo7
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("�����뿼�Գɼ�:");
		int score = s.nextInt();
		if(score > 100||score < 0)
			System.out.println("�ɼ����벻�Ϸ�");
		if(score>=90&&score<=100)
			System.out.println("�ɼ�����");
		if(score>=80&&score<90)
			System.out.println("�ɼ�����");
		if(score>=70&&score<80)
			System.out.println("�ɼ�һ��");
		if(score>=60&&score<70)
			System.out.println("�ɼ�����");
		if(score<60&&score>=0)
			System.out.println("�ɼ�������");
	}
}