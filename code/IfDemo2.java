import java.util.Scanner;
class IfDemo2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = s.nextInt();
		if(age > 70)
		{
			System.out.print("老年人：");
		}
		System.out.println("bye-bye");
	}
}
