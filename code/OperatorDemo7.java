class OperatorDemo7 
{
	public static void main(String[] args) 
	{
		int a = 10;
		a += 20;//a = a + 20;
		System.out.println(a);
		a *= 10;//a = a * 10;
		System.out.println(a);
		a /= 10;//a = a / 10;
		System.out.println(a);
		a %= 10;//a = a % 10;
		System.out.println(a);

		int b = 20;
		b += 5.5;//b = b + 5.5;�� ===> b = (int)(b + 5.5)
		System.out.println(b);
		/*
			��������������Ŀ��
			short s1 = 1;
			//a. 1 Ĭ����int ���Զ�ת����short
			1. s1 = s1 + 1;  2. s1 += 1;�ĸ����ĸ�����
			b. s1 = s1 + 1ʱ��1Ϊint���� s1Ϊ short���� ���������Ϊint
				��ֵ����short s1 ���Դ���
			c.��s1 += 1 ====>(short)(s1 + 1);
		*/
	}
}