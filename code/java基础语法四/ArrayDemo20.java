class ArrayDemo20 
{
	public static void main(String[] args) 
	{
		int[][][] a = {
			{
				{1,2,3},
				{4,5}
			},
			{
				{6,7,8,9,10},
				{11,12},
				{13,14}
			},
			{
				{15,16,17}
			}
		};
		//��ά������,��ά����ĸ���
		System.out.println(a.length);
		//a[1] --->��ά�����еĵ�2����ά����
		System.out.println(a[1].length);
		int[][] a1 = a[1];//a[1]�������1����ά����
		//a[1][1] --->��ά�����еĵ�2����ά�����2��һά����
		System.out.println(a[1][1].length);
		//��1����ά�����еĵ�2��һά�����еĵ�2��Ԫ��
		System.out.println(a[0][1][1].length);
	}
}
