import java.util.Arrays;
class ArrayDemo13 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6};
		a = insertArray(a,1,100);
		System.out.println(Arrays.toString(a));
	}
	public static int[] insertArray(int[] a,int pos,int value){
		if(pos < 0 || pos > a.length)
			return a;//�±겻��,ֱ�ӷ���ԭ����,�Ժ����쳣����
		//����һ��Ԫ��,��Ҫ����,Ȼ����
		a = Arrays.copyOf(a,a.length+1);
		for(int i = a.length-1;i > pos;i--){
			a[i] = a[i-1];//���ƶ�
		}
		a[pos] = value;
		return a;
	}
}
