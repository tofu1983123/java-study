class OperatorDemo1 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 20;
		int c = a + b; 
		System.out.println(10%3);
		//�����������ֻȡ�������֣�ֻ�и������ʱ��Ż���С��
		System.out.println(10/3);

		int n = 123;//�����е��������
		//ȡ��λ
		int a1 = n % 10;
		//ȡʮλ
		int a2 = n / 10 % 10;
		//ȡ��λ
		int a3 = n / 100;
		System.out.println(a1 + a2 + a3);
	}
}
