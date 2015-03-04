/*
	输入一个数字,判断该数字是否为素数(素数就是质数)
    只能被1和自己整除的数
	思路:
		假设数字是n,拿到这个数字就从2开始除 一直除到n-1
		如果都有余数,那么就说明是素数,否则不是素数.
		循环控制for(int i=2;i<n;i++)
		但是一个数字除以大于自己一半(不包含自己)的数肯定有余数.
		for(int i=2;i <= n/2;i++)
*/
import java.util.Scanner;
class ForDemo9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int n = s.nextInt();
		int i;
		for(i = 2;i <= n/2;i++){
			if(n % i == 0)
				break;
			//else
			//	continue;
		}
		/*
			我如何判断是否为素数呢
			分析:上述循环有几个可以结束循环的地方
				两个地方:a.i<= n/2条件不成立时 临界点是 i=n/2
						 b.遇到了break
				如果是a条件结束的循环 那么说明是素数
				如果是b条件结束的循环 那么说明不是素数
				如果b结束 i是达不到临界点 i = n/2 + 1
		*/
		if(i > n/2){
			System.out.println(n + "是素数");
		}else{
			System.out.println(n + "不是素数");
		}
	}
}
