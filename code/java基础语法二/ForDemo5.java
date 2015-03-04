import java.util.Scanner;
class ForDemo5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数字:");
		int n = s.nextInt();
		//n!=1*2*...*n  n! = (n-1)!*n
		long t = 1;
		for(int i = 1;i <= n;i++){
			t *= i;
		}
		System.out.println(n+"的阶乘是:"+t);
	}
}
