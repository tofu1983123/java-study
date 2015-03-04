/*
	请输入一个整数,要计算其各个数位之和
	假设输入123 就计算1+2+3 和是6.
	思路:
		假设1234
		先取出各位4,%10 就得到累加
		然后除以10 再取出给位%10 累加
		...
		剩下1   再取出个位 %10 累加
		再除10就为0,说明已经没有位数了,结束
*/
import java.util.Scanner;
class WhileDemo2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int n = s.nextInt();
		int t = n;
		int sum = 0;//存放和
		while(t != 0){
			sum = sum + t % 10;
			t = t / 10;
		}
		System.out.println(n+"的各个数位之和是:"+sum);
	}
}
