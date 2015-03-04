class OperatorDemo2 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int c = a++;
		/*a++的表达式的值是10  ++a的表达式的值是11
		  a都做了 a = a + 1
		*/
		//int d = ++a;
		System.out.println("c="+c+" a="+a);
	}
}
