class DataTypeDemo1 
{
	public static void main(String[] args) 
	{
		//单独直接列出数字默认为int类型
		//直接一个数字，称为数字字面量，整数的字面量默认先是int类型
		int a = 10;

		byte b = 10;/*默认转换了(前提是byte能容纳)
		--->自动去掉了前面的0，只留下8位*/

		//byte c1 = 1000000000;等式右边的数字默认就是int 放入byte，放不下就报错
		//int c2 = 10000000000000000000;
		
		//打印a的二进制	java中默认把前面的0会去掉
		System.out.println(Integer.toBinaryString(a));

		int c = -10;//去看下二进制
		/*
			1.推理过程
			负数 = 正数去反 + 1
			-10的先看10的二进制
			0000 24个0 1010
			取反
			28个1 0101
			加1
			28个1 0110
		*/
		System.out.println(Integer.toBinaryString(c));
		
		int d = -30;
		/*
			30 = 2(4)+2(3)+2(2)+2(1)  24个0 0001 1110
			取反	24个1 1110 0001
			加1		24个1 1110 0010
		*/
		System.out.println(Integer.toBinaryString(d));

		//用十六进制 0x开头代表十六进制
		int e = 0x23;//3*16(0)+2*16(1) = 35
		System.out.println(e);
		//用八进制  0开头
		int f = 036;//6*8(0)+3*8(1) = 30
		System.out.println(f);
		System.out.println(Integer.toHexString(d));

		//int 最大值 0(31个)1
		System.out.println(Integer.MAX_VALUE);//2147483647
		//0(31个)1 +1的话就变成1后面31个0
		int g = Integer.MAX_VALUE + 1;
		System.out.println(g + "," + Integer.MIN_VALUE);//-2147483648

	}
}
