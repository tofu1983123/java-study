/*
	作业2:
	读入一个三位数,计算其各位数字之和.
	例如:123各位数字之和为6.
*/
import java.util.Scanner;
class Homework2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个三位数:");
		int num = s.nextInt();
		int sum = 0;
		if(num/100 > 0 && num/100 < 10){
			sum = num%10 + num/10%10 + num/100;
		}else{
			System.out.println("输入的三位数有误!");
		}
		if(sum > 0)
			System.out.println("三位数各位数字之和为:" + sum);
	}
}
