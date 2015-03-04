import java.util.Scanner;
class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n = s.nextInt();
		switch (n)
		{
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		default :
			System.out.println("输入有误!");
			break;
		}
		System.out.println("bye-bye");
	}
}
