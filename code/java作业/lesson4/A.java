class A
{
	public static void main(String[] args) 
	{
		System.out.println(getFactorial(5));
		System.out.println(isPrime(5));
	}
	public static long getFactorial(int n){
		if(n == 1) 
			return 1;
		return getFactorial(n-1) * n;
	}
	public static boolean isPrime(int n){
		int i;
		for(i = 2;i <= n/2;i++){
			if(n % i == 0)
				break;
		}
		if(i > n/2){
			return true;
		}else{
			return false;
		}
	}
}
