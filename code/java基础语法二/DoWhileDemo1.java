class DoWhileDemo1 
{
	public static void main(String[] args) 
	{
		int sum = 0,i = 1;
		do
		{
			sum += i;
			i++;
		}
		while (i <= 100);
		System.out.println(sum);
		/*
			˫ɫ��6������,һ�ź���
			do
			{
				ȡ����
			}while(���� �ж������Ƿ��Ѿ����� ������ڼ���ѭ��)
		*/
		int sum1 = 0,j = 1;
		do
		{
			sum1 = sum1 + j;
			j++;
			if(j > 100)break;
		}
		while (true);
		System.out.println(sum1);
	}
}
