/*
	求1到100之间奇数的和
*/
class ForDemo3 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		/*for(int i = 1;i <= 100;i++){
			if(i%2 == 1){
				sum += i;
			}
		}*/
		for(int i = 1;i <= 100;i += 2){
			sum += i;
		}
		System.out.println("sum="+sum);
	}
}
