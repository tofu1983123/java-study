class DataTypeDemo1 
{
	public static void main(String[] args) 
	{
		//����ֱ���г�����Ĭ��Ϊint����
		//ֱ��һ�����֣���Ϊ������������������������Ĭ������int����
		int a = 10;

		byte b = 10;/*Ĭ��ת����(ǰ����byte������)
		--->�Զ�ȥ����ǰ���0��ֻ����8λ*/

		//byte c1 = 1000000000;��ʽ�ұߵ�����Ĭ�Ͼ���int ����byte���Ų��¾ͱ���
		//int c2 = 10000000000000000000;
		
		//��ӡa�Ķ�����	java��Ĭ�ϰ�ǰ���0��ȥ��
		System.out.println(Integer.toBinaryString(a));

		int c = -10;//ȥ���¶�����
		/*
			1.�������
			���� = ����ȥ�� + 1
			-10���ȿ�10�Ķ�����
			0000 24��0 1010
			ȡ��
			28��1 0101
			��1
			28��1 0110
		*/
		System.out.println(Integer.toBinaryString(c));
		
		int d = -30;
		/*
			30 = 2(4)+2(3)+2(2)+2(1)  24��0 0001 1110
			ȡ��	24��1 1110 0001
			��1		24��1 1110 0010
		*/
		System.out.println(Integer.toBinaryString(d));

		//��ʮ������ 0x��ͷ����ʮ������
		int e = 0x23;//3*16(0)+2*16(1) = 35
		System.out.println(e);
		//�ð˽���  0��ͷ
		int f = 036;//6*8(0)+3*8(1) = 30
		System.out.println(f);
		System.out.println(Integer.toHexString(d));

		//int ���ֵ 0(31��)1
		System.out.println(Integer.MAX_VALUE);//2147483647
		//0(31��)1 +1�Ļ��ͱ��1����31��0
		int g = Integer.MAX_VALUE + 1;
		System.out.println(g + "," + Integer.MIN_VALUE);//-2147483648

	}
}
