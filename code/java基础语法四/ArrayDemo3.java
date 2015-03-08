class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};//a指向了一个数组，数组的内容是1,2,3,4,习惯称为a引用了一个数组
		int[] b = a;//b指向了a指向的数组,a和b引用了同一个数组;
		for(int i = 0;i < b.length;i++){
			System.out.print(b[i]+" ");
			b[i]++;
		}
		System.out.println();
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		a[3] = 100;
		System.out.println(b[3]);
	}
}
