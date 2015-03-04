/*
	while循环写一个死循环
*/
class WhileDemo4 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int i = 1;
		while(true){
			sum = sum + i;
			i++;
			if(i > 100)break;//跳出while结构
		}
		System.out.println(sum);//5050

		/*while(true){//死循环
			System.out.println("hello");
		}*/
		while(i++ > 100);//说明是空循环体,和后面的语句无关
		System.out.println("hello");
	}
}
