/*
	90���� ����
	80-90  ����
	70-80  һ��
	60-70  ����
	0 -60  ������

*/
import java.util.Scanner;
class SwitchDemo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("�����뿼�Գɼ�:");
		int score = s.nextInt();
		int n = score / 10;
		switch (n)
		{
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("һ��");
			break;
		case 8:
			System.out.println("����");
			break;
		case 9:
			System.out.println("����");
			break;
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("���벻�Ϸ�");
		}
	}
}