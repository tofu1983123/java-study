import java.util.Scanner;
class IfDemo4 
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
		//要求这三个数字从小到大排序输出
		/*
		  思路：
			假设a中放入最小的，c中放入最大的。这样最后我只要输出a,b,c即可。
			利用之前将的两个数交换
			1.假设a中要放入最小的，
				首先拿a和b进行比较 如果比b大，那么交换
				a b 中小的放入了a
			2.再拿a和c比，如果a比c大，那么交换
				a b c中最小的放入了a
			3.只剩下b,c了，大的放入c，小的放入了b
			  如果b>c,交换，如果b<c什么都不用做
		*/
		if(a > b)
		{
			int t = a;
			a = b;
			b = t;
		}//已经完成了a,b中小的放入了a中
		if(a > c)
		{
			int t = a;
			a = c;
			c = t;
		}//a,b,c中最小的已经放入a中
		if(b > c)
		{
			int t = b;
			b = c;
			c = t;
		}//b c 中大的放入了c 那么现在a,b,c正好是从小到到排序了
		System.out.println("三个数字从小到大排序为："+a+","+b+","+c);

	}
}
