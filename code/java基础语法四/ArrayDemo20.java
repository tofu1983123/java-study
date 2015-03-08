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
		//三维数组中,二维数组的个数
		System.out.println(a.length);
		//a[1] --->三维数组中的第2个二维数组
		System.out.println(a[1].length);
		int[][] a1 = a[1];//a[1]本身就是1个二维数组
		//a[1][1] --->三维数组中的第2个二维数组第2个一维数组
		System.out.println(a[1][1].length);
		//第1个二维数组中的第2个一维数组中的第2个元素
		System.out.println(a[0][1][1].length);
	}
}
