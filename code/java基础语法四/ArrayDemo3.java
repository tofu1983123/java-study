class ArrayDemo3 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};//aָ����һ�����飬�����������1,2,3,4,ϰ�߳�Ϊa������һ������
		int[] b = a;//bָ����aָ�������,a��b������ͬһ������;
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
