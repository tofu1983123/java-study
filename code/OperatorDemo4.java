class OperatorDemo4 
{
	public static void main(String[] args) 
	{
		int a = 10;
		boolean f1 = a >  10;
		boolean f2 = a >= 10;
		boolean f3 = a <  10;
		boolean f4 = a == 10;
		boolean f5 = a <= 10;
		boolean f6 = a != 10;
		System.out.println(f1+","+f2+","+f3);
		
		//boolean f7 = a++ > 10;//a++����ʽ��ֵ��10 //false
		//boolean f7 = ++a > 10;//true ++a��������ʽ��ֵ��11,����true
		boolean f7 = a-- >= 10;//true
		
		System.out.println(f7);
	}
}