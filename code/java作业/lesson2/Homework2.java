/*
	求水仙花数。所谓水仙花数，是指一个三位数abc，
	如果满足a3+b3+c3=abc(a的3次方)则abc是水仙花数，
	打印所有水仙花数
*/
class Homework2
{
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		for(int m = 101;m < 1000;m++){
			a = m / 100;
			b = m / 10 % 10;
			c = m % 10;
			if((a*a*a + b*b*b + c*c*c) == m){
				System.out.println(m + "是一个水仙花数");
			}
		}
	}
}
