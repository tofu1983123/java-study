class FunDemo4 
{
	public static void main(String[] args) 
	{
		for(int i = 100;i <= 1000;i++){
			isPrimeNumber(i);
		}
	}
	public static void isPrimeNumber(int n){
		int i;
		for(i = 2;i < n/2;i++){
			if(n % i == 0)
				break;
		}
		if(i > n/2){
			System.out.println(n+"是素数");
		}else{
			System.out.println(n+"不是素数");
		}
	}
}
