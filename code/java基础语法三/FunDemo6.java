/*
	打印10到1000之间各个数位之和为5的数字
	要求:求一个数字的各个数位之和先写成函数
*/
class FunDemo6
{
	public static void main(String[] args) 
	{
		for(int i = 10;i <= 1000;i++){
			if(getSum(i) == 5){
				System.out.println(i);
			}
		}
	}
	public static int getSum(int n){//函数有了具体返回值类型,必须通过return返回,否则编译不通过
		int sum = 0;
		while(n != 0){
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}
