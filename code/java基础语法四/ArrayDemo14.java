class ArrayDemo14 
{
	public static void main(String[] args) 
	{
		int[] a = {10,14,2,9,8,7,32};
		//sort(a);
		sort1(a);
		System.out.println(Arrays.toString(a));
	}
	//ѡ������,����С���ҳ���,�ŵ���һ��
	public void void sort(int[] a){
		for(int i = 0;i < a.length-1;i++){
			for(int j = i+1;j < a.length;j++){
				if(a[i] > a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	//ð������,�������ҳ���,�ŵ����һ��
	public void void sort1(int[] a){
		for(int i = 0;i < a.length-1;i++){
			for(int j = 0;j < a.length-1-i;j++){
				if(a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
}
