/*
	whileѭ��дһ����ѭ��
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
			if(i > 100)break;//����while�ṹ
		}
		System.out.println(sum);//5050

		/*while(true){//��ѭ��
			System.out.println("hello");
		}*/
		while(i++ > 100);//˵���ǿ�ѭ����,�ͺ��������޹�
		System.out.println("hello");
	}
}
