class DataTypeDemo3 
{
	public static void main(String[] args) 
	{
		double a = 10.5;
		System.out.println("a="+a);
		//float型以f结尾，不写f则被认为是double而报错
		float b = 20.2f;
		System.out.println("b="+b);
		//浮点数不能做精确运算
		double money = 3.0;
		System.out.println(money - 2.9);
		////0.10000000000000009
	}
}
