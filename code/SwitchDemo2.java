import java.util.Scanner;
class SwitchDemo2 
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
		/*
			请输入年月日,判断这个日期在这一年当中已经过了多少天.
			假设输入了1999年,4,20
			只要1月2月3月的天数总和再加上20天即可
			switch(m - 1){				
			}
			累计求和会定义个变量放最终的和,从0开始
		*/
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
			if(y%4==0&&y%100!=0||y%400==0)
				sum += 29;
			else
				sum += 28;
		case 1:
			sum += 31;
		}
		sum += d;
		System.out.println(y+"年"+m+"月"+d+"日在这一年已经过去的天数:"+sum);
	}
}
