/*
	已知faibonacci(费波那契)数列的前几个数分别为0,1,1,2,3,5,… …。
	从第3项开始，每一项都等于前两项的和。
	读入一个整数n，编程求出此数列的前n项的和。
	注意：这里的数列是从0开始的。
	0 1 1 2 3 5 8 13 …
	分析:
	如果输入的整数是5,那么就是求前5项的和
	前一项sum = 0			= 0  sum + sum
	前二项sum = 0+1         = 1  sum + sum
	前三项sum = 0+1+1       = 2  sum + sum 第n项 = n-2项 + n-1项 前n项的和 = 第n项 + 前n-1项的和
											 3       1(0)+   2(1)          =       + (b + a)
											 4       2(1)+   3(1)          
											 5       3(1)+   4(2)
	前四项sum = 0+1+1+2     = 4     
	前五项sum = 0+1+1+2+3   = 7
*/
import java.util.Scanner;
class Homework5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("请输入费波那契数列的项数n(n>0):");
		int n = s.nextInt();
		int sum = 0;//表示前n项的和
		int a = 0;//表示n-2项
		int b = 1;//表示n-1项
		int c = 0;//表示第n项
		if(n > 2){
			sum = a + b;
			System.out.print("费波那契数列的各项为:");
			System.out.print(a+" ");
			System.out.print(b+" ");
			for(int i = 2;i < n;i++){
				c = a + b;
				a = b;
				b = c;
				System.out.print(c+" ");
				sum = sum + c;
			}
		}else if(n == 1){
			sum = a;
			System.out.print("费波那契数列的各项为:");
			System.out.print(a+" ");
		}else if(n == 2){
			sum = a + b;
			System.out.print("费波那契数列的各项为:");
			System.out.print(a+" ");
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("费波那契数列前"+n+"项的和是:"+sum);
	}
}
