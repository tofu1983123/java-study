class FunDemo9 
{
	public static void main(String[] args) 
	{
		int c = 10,d = 20;
		swap(c,d);
		System.out.println("c="+c+",d="+d);//结果还是c=10,d=20
		/*
			java中使用内存时，直接把内存分为堆、栈
			堆内存，通过垃圾回收器回收内存。
			栈内存，用完自动释放，并且先进后出。
		*/
		int a = 30,b = 40;
		swap(a,b);
		System.out.println("a="+a+",b="+b);//结果还是a=30,b=40
	}
	//写一个函数,实现两个变量的交换.
	public static void swap(int a,int b){//int a = c;int b = d;
		int t = a;
		a = b;
		b = t;
	}
}
