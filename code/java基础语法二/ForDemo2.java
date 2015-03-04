/*
	求1到100的和
	累计求和 定义一个变量存放最终的和
	int sum = 0;
	第一次累计1,第二次累计2,...第100次累计100
	总共累计100次
*/
class ForDemo2 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			sum += i;
		}
		System.out.println("sum="+sum);

		int sum1 = 0;
		for(int i = 100;i >= 1;i--){
			sum1 += i;
		}
		System.out.println("sum1="+sum1);
	}
}
