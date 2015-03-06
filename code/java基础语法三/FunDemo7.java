class FunDemo7 
{
	public static void main(String[] args) 
	{
		for(int i= 10;i <= 1000;i++){
			int rn = reverseNumber(i);//�õ�i���ú������
			if(isPrimeNumber(i) && isPrimeNumber(rn)){
				System.out.println(i);
			}
		}
	}
	public static int reverseNumber(int n){
		int sum = 0;
		while(n != 0){
			sum = sum * 10 + n % 10;
			n = n / 10;
		}
		return sum;
	}
	public static boolean isPrimeNumber(int n){
		//����1,2����ѧ�в��������Ļ�,�����������������
		//if(n==1||n==2)return false;
		//���ֻ��1���� if(n==1)return false;
		for(int i = 2;i < n/2;i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
