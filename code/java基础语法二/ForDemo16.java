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
		/*for(;j <= 100;j++){//ʡ�Ե�һ�����ʽ
			sum += j;
		}*/
		/*for(;;j++){//ʡ�Եڶ������ʽ
			if(j > 100)break;
			sum += j;
		}*/
		/*for(;j<=100;){//ʡ�Ե��������ʽ
			sum += j;
			j++;
		}*/
		for(;;){//ȫʡ����
			if(j > 100)break;
			sum += j++;
		}
		System.out.println(sum);
	}
}
