/*
	如果一个数等于其所有因子之和，
	我们就称这个数位“完数”，例如6的因子为1,2,3
	6=1+2+3 那么6就是一个完数。
	请编程打印出1000以内所有的完数
	
	6   = 1 + 2 + 3
	28  = 1 + 2 + 4 + 7 + 14
	496 = 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248

*/
class Homework3 
{
	public static void main(String[] args) 
	{
		int a,b,sum = 0;
        for(a = 1;a <= 1000;a++) 
		{
            for(b = 1;b < a;b++)
			{
                if(a % b == 0)
				{
                    sum = sum + b;//累加因子的和
                }
            }
            if(sum == a)//判断因子的和与该数是否相等
			{
                System.out.println(sum);
            }
            sum = 0;//清零，用于下一个数的因子累加。
        }
	}
}
