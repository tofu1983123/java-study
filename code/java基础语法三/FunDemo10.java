/*
	写一个函数，求一个数据的阶乘。用递归处理
*/
class FunDemo10
{
	public static void main(String[] args) 
	{
		System.out.println(jiecheng(5));
	}
	//阶乘 n! = (n - 1)! * n;
	public static long jiecheng(int n){
		int t = 1;
		for(int i = 1;i <= n;i++){
			t *= i;
		}
		return t;
	}

	public static long jiecheng1(int n){
		if(n == 1)
			return 1;
		return jiecheng1(n-1) * n;//自己调用自己,利用栈的先进后出的原理
	}
}
