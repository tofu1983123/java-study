class ArrayDemo18 
{
	public static void main(String[] args) 
	{
		int[][] a = {
			{1,2,3,4,5},
			{5,6,7},
			{9,10}
		};
		int[][] b = new int[][]{{1,2,3},{4,5,6}};
		//��ά����ĳ���,��������һά����ĸ���
		System.out.println(a.length);
		/*
			a��������һά����,
			��һ��һά��������ֽ�a[0];
			�ڶ���һά��������ֽ�a[1];
			������һά��������ֽ�a[2];
		*/
		//��ά�����е�2��һά����ĳ���
		System.out.println(a[1].length);
		//�����ڶ���һά���������Ԫ��
		for(int j = 0;j < a[1].length;j++){
			System.out.println(a[1][j]+" ");
		}
		System.out.println();
		//������ά�����е�����Ԫ��
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
