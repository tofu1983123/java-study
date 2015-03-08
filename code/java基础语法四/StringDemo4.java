import java.util.Scanner;
class StringDemo4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a = s.nextInt();//输入整数,如果以0开头,0会被自动去掉
		System.out.println(a);
		System.out.println("请输入一个字符串:");
		String str1 = s.next();
		System.out.println(str1);

		int b = 123;//数字123
		String str2 = "123";//字符串123
		String.out.println(b+str2);//打印结果为 123123
		//如果希望把一个字符串数字转换成数字类型的数字
		int c = Integer.parseInt(str2);//把数字字符串转换成数字类型
		System.out.println(b+c);//打印结果为 246
	}
}
