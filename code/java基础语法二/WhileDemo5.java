/*
	求10到1000之间各个数位之和为5的数字,打印输出
*/
class WhileDemo5
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 10;i <= 1000;i++)
		{
			int sum = 0;
			int t = i;
			while(t != 0)
			{
				sum = sum + t%10;
				t = t / 10;
			}
			if(sum == 5)
			{
				count++;
				System.out.print(i+" ");
				if(count%5 == 0)System.out.println();
			}
		}
	}
}
