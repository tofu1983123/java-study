import java.util.Scanner;
class IfDemo3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int a = s.nextInt();
		System.out.println("请输入第二个数字：");
		int b = s.nextInt();
		System.out.println("请输入第三个数字：");
		int c = s.nextInt();
		/*思路：定义一个变量专门存放最大值,假设任意一个
		  就是max，然后和另外两个比较
		  1.现在假设max=a;
		  2.那么就让max先和b比较，如果比b大，max不变，如果比b小，
			那么max为b。a,b中大的放入了max中。
		  3.在拿max和c比，如果比c大，max不变，如果比c小，max值就为c的值
		*/
		int max = a;
		if(max < b)
			max = b;//a b 中大的放入了max中。
		if(max < c)
			max = c;//a b c中最大的放入了max中。
		System.out.println(a+","+b+","+c+"中最大值为:" + max);
	}
}
