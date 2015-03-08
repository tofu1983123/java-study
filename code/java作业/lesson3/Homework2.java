/*
	如果整数A的全部因子(包括1，不包括A本身)之和等于B，
	且整数B的全部因子(包括1，不包括B本身)之和等于A，
	则称整数A\B是一对亲密数。求3000以内的全部亲密数。
*/
class Homework2 
{
	public static void main(String[] args) 
	{
		int A = 0,B = 0;
		for(int i = 1;i < 3000;i++){
			for(int j = 1;j < i;j++){
				A = i;
				B = j;
				if(sumDivisor(A) == B && sumDivisor(B) == A){
					System.out.println(A+"和"+B+"是一对亲密数");
				}
			}
		}
		/*
			打印的结果：248和220，1210和1184，2924和2620
		*/
		
	}
	public static int sumDivisor(int n){
		int sum = 0;
		for(int i = 1;i <= n/2;i++){
			if(n % i == 0){//没有余数,是因子
				sum += i;
			}
		}
		return sum;
	}
}
