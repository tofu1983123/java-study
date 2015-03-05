/*
	打渔还是晒网
	中国有句老话叫“三天打渔，两天晒网”。
	假设有一个人从2000年1月1日开始“三天打渔两天晒网”，读入三个整数，
	分别表示年份、月份、日期，问这三个整数所表示的那天，这个人是在打渔还是在晒网？
	求这个日期和2000年1月1日相差多少天?(假设输入的日期都是合法的)
	相差0天    打渔
	    1天    打渔
		2天    打渔
		3天    晒网
		4天    晒网
		5 6 7  打渔
		8 9    晒网
		---->结论：相差的天数subDays % 5 等于0,1,2就是打渔,3,4就是晒网
		2000 - 1 - 1
		假设 2010 10 10相差的天数 怎么算呢
		2000年还剩下的天数就是365,01年到09年的整天数,10年已经过去的天数
		需要注意,如果是同一年(输入的日期已经过去的天数-1即可)

*/
import java.util.Scanner;
class Homework4 
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
		int sum = 0;//记录相差的天数
		int sum1 = 0;//记录这个日期在这一年已经过了多少天.
		switch (m-1)
		{
		case 11:sum1 += 30;
		case 10:sum1 += 31;
		case 9: sum1 += 30;
		case 8: sum1 += 31;
		case 7: sum1 += 31;
		case 6: sum1 += 30;
		case 5: sum1 += 31;
		case 4: sum1 += 30;
		case 3: sum1 += 31;
		case 2: 
			if(y%4==0&&y%100!=0||y%400==0)
				sum1 += 29;
			else
				sum1 += 28;
		case 1: sum1 += 31;
		}
		sum1 += d;
		if(y == 2000){
			sum = sum1 - 1;
		}else if(y > 2000){
			int sum2 = 365;//计算了2000年1月1日在这一年还剩下多少天。
			int sum3 = 0;//计算相差的年份的整天数，闰年加366，非闰年加365
			for(int i = 2001;i < y;i++){
				if(i%4 == 0 && i%100 != 0||i%400 == 0){
					sum3 += 366;
				}else{
					sum3 += 365;	
				}
			}
			sum = sum1 + sum2 + sum3;
		}
		System.out.println(y+"年"+m+"月"+d+"日和2000年1月1日相差的天数是:"+sum);
		if(sum%5 == 0||sum%5 == 1||sum%5 == 2){
			System.out.println(y+"年"+m+"月"+d+"日在打渔");
		}else{
			System.out.println(y+"年"+m+"月"+d+"日在晒网");
		}
	}
}
