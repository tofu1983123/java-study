class OperatorDemo1 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 20;
		int c = a + b; 
		System.out.println(10%3);
		//两个整数相除只取整数部分，只有浮点除的时候才会有小数
		System.out.println(10/3);

		int n = 123;//对其中的数字求和
		//取个位
		int a1 = n % 10;
		//取十位
		int a2 = n / 10 % 10;
		//取百位
		int a3 = n / 100;
		System.out.println(a1 + a2 + a3);
	}
}
