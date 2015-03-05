/*
	输入一个数，因式分解
	如输入90得到90 = 2*3*3*5
		  80得到80 = 2*2*2*2*5

	90 / 2 ===> 输出 2 *
	45 / 3 ===> 输出 3 *
	15 / 3 ===> 输出 3 *
	5是质数===> 输出 5 

*/
import java.util.Scanner;
class Homework1 
{
	public static void main(String[] args) 
	{
		///*方法1
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n = s.nextInt();
		int i;
		System.out.print(n + " = ");
		for(i = 2;i <= n;){//从2开始除到本身，用于判断素数
			if(n % i == 0){//找到素数的因子
				System.out.print(i);//打印因子
				n = n / i;//继续分解 除以素数因子得到商
				if(n != 1)//判断是否为最后一个因子,不是就打印乘号
					System.out.print("*");
			}else{
				i++;
			}
		}
		//*/
		/*方法2
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n = s.nextInt();
		int i;
		int divisor = 2;
		System.out.print(n + " = ");
		while(n > 1){
			for(i = 2;i <= n;i++){//从2开始除到本身，用于判断素数
				if(n % i == 0){//找到素数的因子
					divisor = i;
					System.out.print(i);//打印因子
					break;
				}
			}
			n = n / divisor;//继续分解 除以素数因子得到商
			if(n != 1)
				System.out.print("*");
		}
		*/
	}
}
