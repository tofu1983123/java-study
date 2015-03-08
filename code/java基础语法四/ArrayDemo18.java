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
		//二维数组的长度,就是其中一维数组的个数
		System.out.println(a.length);
		/*
			a中有三个一维数组,
			第一个一维数组的名字叫a[0];
			第二个一维数组的名字叫a[1];
			第三个一维数组的名字叫a[2];
		*/
		//二维数组中第2个一维数组的长度
		System.out.println(a[1].length);
		//遍历第二个一维数组的所有元素
		for(int j = 0;j < a[1].length;j++){
			System.out.println(a[1][j]+" ");
		}
		System.out.println();
		//遍历二维数组中的所有元素
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
