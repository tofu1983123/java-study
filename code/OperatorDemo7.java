class OperatorDemo7 
{
	public static void main(String[] args) 
	{
		int a = 10;
		a += 20;//a = a + 20;
		System.out.println(a);
		a *= 10;//a = a * 10;
		System.out.println(a);
		a /= 10;//a = a / 10;
		System.out.println(a);
		a %= 10;//a = a % 10;
		System.out.println(a);

		int b = 20;
		b += 5.5;//b = b + 5.5;错 ===> b = (int)(b + 5.5)
		System.out.println(b);
		/*
			有这样的面试题目：
			short s1 = 1;
			//a. 1 默认是int 能自动转换成short
			1. s1 = s1 + 1;  2. s1 += 1;哪个对哪个错？
			b. s1 = s1 + 1时，1为int类型 s1为 short类型 加起来结果为int
				赋值给了short s1 所以错误
			c.而s1 += 1 ====>(short)(s1 + 1);
		*/
	}
}
