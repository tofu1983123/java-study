class FunDemo3 
{
	public static void main(String[] args) 
	{
		int a1 = add(10,5);
		int b1 = add(15,20);
		System.out.println(a1+","+b1);
	}
	public static int add(int a,int b){
		int c = a + b;
		//如果函数有具体数据类型的返回值类型(除void)
		//必须用return关键字返回
		return c;
	}
}
