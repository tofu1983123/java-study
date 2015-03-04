/*
	输入一个数字,将该数字倒置
	输入1234得到4321
	思路:1.先获取得到4
		 2.n=n/10如果除以10不等于0(说明前面有位数)
		 3.4*10+3===>(取现在的个位) n = n/10 --->12(还不等于0)
		 4.43*10+2===>(取现在的个位) n = n/10 --->1(还不等于0)
		 5.432*10+1===>(取现在的个位) n = n/10 (等于0,循环结束)
	总结:求和 假设变量是sum
		 sum*10+个位
		 n = n/10;
*/
import java.util.Scanner;
class WhileDemo3 
{
	public static void main(String[] args) 
	{
		/*int a = 123;
		System.out.print(a%10);
		System.out.print(a/10%10);
		System.out.print(a/100);*/
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int n = s.nextInt();
		int t = n;
		int reverseNumber = 0;
		while(n != 0){
			reverseNumber = reverseNumber*10 + n%10;
			n = n/10;
		}
		System.out.println(t+"倒置后是:"+reverseNumber);



	}
}
