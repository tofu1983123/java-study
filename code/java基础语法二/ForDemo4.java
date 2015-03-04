/*
	打印1到100之间既能被3整除又能被5整除的数字
	并记录有几个
*/
class ForDemo4
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 3 == 0 && i % 5 == 0){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("共计"+count+"个");
	}
}
