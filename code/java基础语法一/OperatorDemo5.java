class OperatorDemo5 
{
	public static void main(String[] args) 
	{
		int a = 10,b = 20;
		boolean f1 = a >= 5 && a <= 20;
		//boolean f2 = a++ > 10 && b-- < 10;
		/*
			计算第一个表达式
			a++>10条件成立？  不成立  第一个表达式false  a是11
			第二个不计算
		*/
		//boolean f2 = a++ > 10 && b-- < 10;
		boolean f2 = a++ >= 10 && b-- < 10;
		System.out.println(f2 + ",a=" + a + ",b=" + b);

		int c = 20,d = 30;
		boolean f3 = c++ >= 20 || d-- >= 10;
		System.out.println(f3 + ",c=" + c + ",d=" + d);

		System.out.println(!f3);
	}
}
