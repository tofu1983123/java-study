import java.util.Arrays;
import java.util.Random;
class ArrayDemo17 
{
	public static void main(String[] args) 
	{
		int[] a = new int[1000000];
		for(int i = 0;i < a.length;i++){
			//�����ֵ
			Random r = new Random();
			a[i] = r.nextInt();//��ȡһ�����������
		}
		//��õ�ǰ��ʱ�䵽1970��1��1��0ʱ��ʼ���ĺ�����
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
