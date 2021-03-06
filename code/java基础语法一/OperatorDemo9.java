class OperatorDemo9 
{
	public static void main(String[] args) 
	{
		int a = 10;
		//转换成二进制，往后挪动2位前面补0，最后两位抹去
		System.out.println(a>>2);//右移动一位相当于除以2
		System.out.println(Integer.toBinaryString(a>>2));

		int b = -10;
		//前面补位，补1，后面抹去
		/*
			推理过程
			a.先得到-10的二进制  
				10的二进制 28个0 1010
				取反	   28个1 0110 ---> +1
				-10的二进制28个1 0110
			b.移动
				右移动2位 11 28个1 01 这个就是最终的负数
			c.计算最后结果
				负数取反+1得到对应的正数
				00 28个0 10 +1 ===>得到对应正数 00 28个0 11
				正数是3，对应的负数是-3
		*/
		System.out.println(b>>2);

		//无符号右移专门针对负数  负数在前面也是补0
		System.out.println(b>>>2);

		System.out.println(a<<2);//左移动一位*2
		System.out.println(b<<2);
		System.out.println("=====================");

		int c1 = 5,d1 = 4;
		/*把两个数字都转换成二进制 然后一位一位运算
		都是1这一位就为1 否则为0
		得到的二进制再转换成十进制即可*/
		System.out.println(c1 & d1);
		/*把两个数字都转换成二进制 然后一位一位运算
		都是0这一位就为0 否则为1
		得到的二进制再转换成十进制即可*/
		System.out.println(c1 | d1);
		/*把两个数字都转换成二进制 然后一位一位运算
		相同为0 不同为1
		得到的二进制再转换成十进制即可*/
		System.out.println(c1 ^ d1);

		/*
			如果 c = a ^ b
			那么 b = c ^ a
				 a = c ^ b
		*/
		int c = 10,d = 20;
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;
		System.out.println("c="+c+" d="+d);
	}
}
