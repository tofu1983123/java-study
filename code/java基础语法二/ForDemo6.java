/*
	1!+2!+��+10!
*/
class ForDemo6 
{
	public static void main(String[] args) 
	{
		long sum = 0;
		long t = 1;
		for(int i = 1;i <= 10;i++){
			t *=i;//ѭ����һ�ν������1�Ľ׳�,�ڶ��ν������2�Ľ׳�...
			sum += t;//�ۼƽ׳�
		}
		System.out.println(sum);
	}
}
