import java.util.Scanner;
class IfDemo9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入数字:");
		int number = s.nextInt();
		if(number > 0)
			System.out.println(number + "是正数");
		else if(number < 0)
			System.out.println(number + "是负数");
		else
			System.out.println("数字是0");
	}
}