class ArrayDemo2 
{
	public static void main(String[] args) 
	{
		int[] a;//声明了一个int数组
		a = new int[]{1,2,3,4,5,6,7,8,9,10};//给数组初始化
		System.out.println(a.length);
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("======================");
		int[] b = new int[6];//开辟了一个数组空间，大小是6
		b[0] = 1;
		b[1] = 2;
		for(int i = 0;i < b.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}
