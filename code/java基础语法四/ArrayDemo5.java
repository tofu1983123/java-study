class ArrayDemo5
{
	public static void main(String[] args) 
	{
		//ʵ�����鵹��,��һ��Ԫ�غ����һ������,�ڶ����͵����ڶ�������
		int[] a = {1,2,3,4,5,6};
		for(int i = 0;i < a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
}
