/*
	打印100到1000之间的所有素数
	思路:先要用循环代表100到1000之间所有的数字
		然后一个一个拿出来,判断该数字是否为素数
		for(int n = 100;n <= 1000;n++)
		但是大于2的偶数都不是素数---> 因为大于2的偶数都能整除2
		for(int n = 101;n < 1000;n += 2)

		每五个素数进行换行
*/
import java.util.Scanner;
class ForDemo10
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int n = 101;n < 1000;n += 2){//n其实就代表了101到1000
			//拿到n,判断n是否为素数
			int i;
			for(i = 2;i <= n/2;i++){
				if(n % i == 0)
					break;
			}
			if(i > n/2){//是素数 打印 否则不做
				count++;
				System.out.print(n+" ");
				if(count % 5 == 0){
					System.out.println();//换行
				}
			}
		}
	}
}