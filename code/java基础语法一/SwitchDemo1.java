import java.util.Scanner;
class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("������һ������:");
		int n = s.nextInt();
		switch (n)
		{
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		default :
			System.out.println("��������!");
			break;
		}
		System.out.println("bye-bye");
	}
}
