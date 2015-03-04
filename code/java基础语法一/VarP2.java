class VarP2
{
	public static void main(String[] args)
	{
		//实现两个变量交换不用第三个变量
		int a = 10 , b = 20;
		a = a + b;//现在a标识的内存中放的是a和b的和
		b = a - b;//a已经是a，b的和，再减去b就是以前的a，现在赋值给了b
		//再往下走b中已经是以前的a了
		a = a - b;//等式右边a是总和，b是以前的a，相减之后得到以前的b
		//赋值给了a
		System.out.println("a="+a+",b="+b);
	}
}