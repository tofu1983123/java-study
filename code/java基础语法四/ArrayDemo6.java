class ArrayDemo6 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		reverseArray(a);//��������Ϊʵ�ν��д���ʱ,ֻҪ��������������
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+" ");
		}
		//�����Ѿ�����.����û�з���ֵ ���ݹ�ȥ֮�� �βε�a��ʵ��aָ����ͬһ������
		System.out.println("\n================");
		int[] b = {10,20,30,40,50,60};
		int[] c = reverseArray1(b);
		System.out.println(c == b);//���Ϊtrue �������������ȫû��Ҫ�з���ֵ
	}
	public static void reverseArray(int[] a){//������Ϊ��ʽ����
		for(int i = 0;i < a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
	}
	public static int[] reverseArray1(int[] a){//������Ϊ��ʽ����
		for(int i = 0;i < a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = t;
		}
		return a;
	}
}
