/*
	通过键盘输入三个数,分别打印它们的因子(不包含自己)
*/
import java.util.Scanner;
class FunDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个数字:");
		int a = s.nextInt();
		for(int i = 1;i <= a/2;i++){
			if(a%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("请输入第二个数字:");
		int b = s.nextInt();
		for(int i = 1;i <= b/2;i++){
			if(b%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("请输入第三个数字:");
		int c = s.nextInt();
		for(int i = 1;i <= c/2;i++){
			if(c%i == 0){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		/*重复了三次过程,这三个过程都是打印一个数字的因子
		把这个重复的过程提炼出来,每次用的时候,都重复利用
		这个过程,只是这个过程中需要有个变量,代替现在的a,b,c,
		将来就是代替任意一个数字,那么这个过程就是我们说的
		函数,或者叫 方法.*/
	}
}
