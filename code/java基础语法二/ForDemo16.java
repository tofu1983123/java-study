class ForDemo16 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 2;i <= 100;i++);
		System.out.println(i);
		System.out.println("=============");
		int sum = 0;
		int j = 1;
		/*for(;j <= 100;j++){//省略第一个表达式
			sum += j;
		}*/
		/*for(;;j++){//省略第二个表达式
			if(j > 100)break;
			sum += j;
		}*/
		/*for(;j<=100;){//省略第三个表达式
			sum += j;
			j++;
		}*/
		for(;;){//全省略了
			if(j > 100)break;
			sum += j++;
		}
		System.out.println(sum);
	}
}
