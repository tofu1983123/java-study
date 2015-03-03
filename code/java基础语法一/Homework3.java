/*
	作业3:
	输入一个年月日,求这一年还剩下多少天
	(提示:总天数 – 已经过的)
*/
import java.util.Scanner;
class Homework3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年:");
		int y = s.nextInt();
		System.out.println("请输入月:");
		int m = s.nextInt();
		System.out.println("请输入日:");
		int d = s.nextInt();
		int sumday = 365;//假设这一年共有365天.
		int sum = 0;
		switch (m-1)
		{
		case 11:
			sum += 30;
		case 10:
			sum += 31;
		case 9:
			sum += 30;
		case 8:
			sum += 31;
		case 7:
			sum += 31;
		case 6:
			sum += 30;
		case 5:
			sum += 31;
		case 4:
			sum += 30;
		case 3:
			sum += 31;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0){
				sum += 29;
				sumday = 366;
			}else{
				sum += 28;
				sumday = 365;
			}
		case 1:
			sum += 31;
		}
		sum += d;
		//System.out.println("这一年过去的天数为:"+sum+"天");
		sum = sumday - sum;
		System.out.println("这一年还剩下的天数为:"+sum+"天");
	}
}
