class ArrayDemo6 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		reverseArray(a);//当数组作为实参进行传递时,只要传递数组名即可
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+" ");
		}
		//数组已经倒置.函数没有返回值 传递过去之后 形参的a和实参a指向了同一个数组
		System.out.println("\n================");
		int[] b = {10,20,30,40,50,60};
		int[] c = reverseArray1(b);
		System.out.println(c == b);//结果为true 表明这个函数完全没必要有返回值
	}
	public static void reverseArray(int[] a){//数组作为形式参数
		for(int i = 0;i < a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
	}
	public static int[] reverseArray1(int[] a){//数组作为形式参数
		for(int i = 0;i < a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
		return a;
	}
}
