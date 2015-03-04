/*
	输入一个正的数字(非1),打印其所有因子,包含1不包含自己
	并对所有因子求和
	思路:怎么打印因子,就要获取其因子,因子就是能被该整数整除的
		 拿到数字就开始除,从1开始一直除到n-1如果没有余数就是因子
		 所以循环控制是for(int i=1;i<n;i++)
		 但是一个数字除以大于自己一半的数(不包含自己)肯定有余数
		 所以循环次数可以减少for(int i=1;i <= n/2;i++)
*/
import java.util.Scanner;
class ForDemo7 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数字:");
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1;i <= n/2;i++){
			if(n % i == 0){//没有余数,是因子
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("因子的和是:"+sum);
	}
}
