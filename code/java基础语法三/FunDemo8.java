/*
	计算两个日期之间相差的天数
	思路:假设1998-10-10,2010-5-5
		首先获取1998-10-10这个日期在这一年还剩多少天
		再次获取2010-5-5这个日期在这一年已经过了多少天
		然后获取99年到09年中间的整年天数
		1.写一个函数,判断这一年是否为闰年
		public static boolean isLeap(int y)
		2.写一个函数,计算一个日期在这一年已经过了多少天
		public static int getDays(int y,int m,int d)
		3.写一个函数,计算一个日期在这一年还剩下多少天.
		总天数 - 已经过去的 = 剩下的天数
		public static int otherDays(int y,int m,int d)
		4.写一个函数,直接计算两个日期相差的天数.
		public static int subDays(int y1,int m1,int d1,int y2,int m2,int d2)

		一定是计算小的年已经剩下的,大的年已经过的,中间年是整天数.
*/
class FunDemo8 
{
	public static void main(String[] args) 
	{
		//System.out.println(getDays(2000,4,20));
		System.out.println(subDays(1999,1,5,2001,1,10));
	}
	//判断这一年是否为闰年
	public static boolean isLeap(int y){
		if(y%4 == 0 && y%100 != 0 || y%400 == 0)
			return true;
		//else 可以省略,建议省略,可以简化if-else,叫谓语句代替逻辑分段
			return false;
	}
	//计算一个日期在这一年已经过了多少天
	public static int getDays(int y,int m,int d){
		int sum = 0;
		switch(m -1)
		{
			case 11:sum += 30;
			case 10:sum += 31;
			case 9: sum += 30;
			case 8: sum += 31;
			case 7: sum += 31;
			case 6: sum += 30;
			case 5: sum += 31;
			case 4: sum += 30;
			case 3: sum += 31;
			case 2: 
				if(isLeap(y)){//一个函数调用了另外一个函数,但是函数不能嵌套声明
					sum += 29;
				}else{
					sum += 28;
				}
			case 1: sum += 31;
		}
		sum += d;
		return sum;
	}
	//计算一个日期在这一年还剩下多少天
	public static int otherDays(int y,int m,int d){
		if(isLeap(y))
			return 366 - getDays(y,m,d);
		//else 可以省略
			return 365 - getDays(y,m,d);
	}
	public static int subDays(int y1,int m1,int d1,int y2,int m2,int d2){
		
		if(y1 == y2){//只要计算y1年已经过的-y2年已经过的就是相差的,可能是负数
			int days1 = getDays(y1,m1,d1) - getDays(y2,m2,d2);
			return abs(days1);
		}else if(y1 < y2){
			//要求的是,小的年剩下的+大的年过去的+中间年
			int sum1 = otherDays(y1,m1,d1);
			int sum2 = getDays(y2,m2,d2);
			int sum3 = 0;
			for(int i = y1+1;i < y2;i++){
				if(isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1 + sum2 + sum3;
		}else{
			int sum1 = getDays(y1,m1,d1);
			int sum2 = otherDays(y2,m2,d2);
			int sum3 = 0;
			for(int i = y2+1;i < y1;i++){
				if(isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
			return sum1 + sum2 + sum3;
		}
	}
	public static int abs(int n){
		return n >= 0 ? n : -n;
	}
}
