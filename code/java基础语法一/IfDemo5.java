import java.util.Scanner;
class IfDemo5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入年龄:");
		int age = s.nextInt();
		if(age < 60)
		{
			System.out.println("请自觉买票");
		}else{
			System.out.println("不需要买票,直接进入!");
		}
	}
}
