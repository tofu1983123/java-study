/*
	�������ݺͿ���ͬʱ
*/
import java.util.Arrays;
class ArrayDemo12 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		//��һ������Ҫ���ݺ͸��Ƶ�����
		//a = Arrays.copyOf(a,2*a.length);
		a = copy(a,2*a.length);
		//ArrayDemo7.printArray(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] copy(int[] a,int newLength){
		int[] t = new int[newLength];
		System.arraycopy(a,0,t,0,a.length);
		return t;
	}

}
