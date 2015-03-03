/*
	90以上 优秀
	80-90  良好
	70-80  一般
	60-70  及格
	0 -60  不及格

*/
import java.util.Scanner;
class SwitchDemo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入考试成绩:");
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
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 9:
			System.out.println("优秀");
			break;
		case 10:
			System.out.println("满分");
			break;
		default:
			System.out.println("输入不合法");
		}
	}
}
