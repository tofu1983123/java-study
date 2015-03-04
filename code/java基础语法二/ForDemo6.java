/*
	1!+2!+…+10!
*/
class ForDemo6 
{
	public static void main(String[] args) 
	{
		long sum = 0;
		long t = 1;
		for(int i = 1;i <= 10;i++){
			t *=i;//循环第一次进入就是1的阶乘,第二次进入就是2的阶乘...
			sum += t;//累计阶乘
		}
		System.out.println(sum);
	}
}
