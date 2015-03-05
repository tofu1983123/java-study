/*
	作业4:
	输入三个数字从大到小排序输出
*/
import java.util.Scanner;
class Homework4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int a = s.nextInt();
		System.out.println("请输入第二个数字:");
		int b = s.nextInt();
		System.out.println("请输入第三个数字:");
		int c = s.nextInt();
		int t = 0;
		if(a < b){
			t = a;
			a = b;
			b = t;
		}//a b中大的放入a
		if(a < c){
			t = a;
			a = c;
			c = t;
		}//a b c中大的放入a
		if(b < c){
			t = b;
			b = c;
			c = t;
		}//b c中大的放入b,小的放入c
		System.out.println("这三个数字从大到小的顺序为:"+a+","+b+","+c);
	}
}