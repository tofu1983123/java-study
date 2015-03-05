class DoWhileDemo1 
{
	public static void main(String[] args) 
	{
		int sum = 0,i = 1;
		do
		{
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println(sum);
		/*
			双色球6颗蓝球,一颗红球
			do
			{
				取蓝球
			}while(条件 判断蓝球是否已经存在 如果存在继续循环)
		*/
		int sum1 = 0,j = 1;
		do
		{
			sum1 = sum1 + j;
			j++;
			if(j > 100)break;
		}
		while (true);
		System.out.println(sum1);
	}
}
