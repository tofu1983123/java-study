class FunDemo5 
{
	public static void main(String[] args) 
	{
		for(int i = 100;i <= 1000;i++){
			//boolean flag = isPrimeNumber(i);
			//if(flag)
			if(isPrimeNumber(i))
				System.out.print(i+" ");
		}
	}
	public static boolean isPrimeNumber(int n){
		for(int i = 2;i < n/2;i++){
			if(n % i == 0)
				return false;//函数遇到return关键字,函数运行结束.
		}
		return true;
	}
}
