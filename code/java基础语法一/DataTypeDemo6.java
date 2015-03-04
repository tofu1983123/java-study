class DataTypeDemo6 
{
	public static void main(String[] args) 
	{
		//自动类型转换
		double d = 10;
		float f1 = 10.2f;
		double d1 = f1;
		System.out.println(d1);
		//强制类型转换--->大范围往小范围
		double d2 = 10.5;
		int a1 = (int)d2;
	}
}
