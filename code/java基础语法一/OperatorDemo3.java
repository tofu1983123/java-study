class OperatorDemo3 
{
	public static void main(String[] args) 
	{
		int a = 15;
		int b = ++a + 2;
		System.out.println(b);
		System.out.println("===========");
		int c = 16;
		//c--表达式的值是16  --c表达式的值是15
		//int d = c--;
		int d = --c;
		System.out.println("d=" + d + " , c=" + c);

		int x = 30;
		x = x++;//1.x++表达式的值是30,2.x要加1，所以此时x是31，然后再把x++的值赋给x，所以x又变回30
		//x = ++x;//1.++x表达式的值是31,2.x要加1，所有x也是31，然后再把++x的值赋给x
		System.out.println(x);
	}
}
