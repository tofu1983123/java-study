import java.util.Scanner;
class IfDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		//通过键盘输入一个整数并直接赋值给变量a
		int a = s.nextInt();//光标在闪，等待输入数据，最好之前有个提示语句
		//按下回车输入结束
		System.out.println("输入的数字是：" + a);
	}
}
