/*
	求两个数字的最大公约数和最小公倍数(辗转除法----对数学特别清楚)
	a.分别找出两个数的公约数,并分别放入数组
	b.找出最大的,就是最大公约数
	c.两数相乘/最大公约数=最小公倍数
*/
class ArrayDemo9 
{
	public static void main(String[] args) 
	{
		print(10,15);
	}
	public static void print(int a,int b){
		//得到a的公约数
		int[] x1 = ArrayDemo7.getSons(a);//Integer.toBinaryString(10);
		ArrayDemo7.printArray(x1);
		//得到b的公约数
		int[] x2 = ArrayDemo7.getSons(b);
		ArrayDemo7.printArray(x2);
		//找出相同且最大的元素就是最大公约数
		int max = ArrayDemo8.getTheSameMax(x1,x2);
		//最小公倍数
		int min = a * b / max;
		System.out.println(a+","+b+"的最大公约数是:"+max+",最小公倍数是:"+min);
	}
}
