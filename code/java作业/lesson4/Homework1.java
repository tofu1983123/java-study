/*
	������һ��int���͵�����,�������10000�����ظ���Ԫ��,�ֲ�ʹ������ķ�ʽ,
	�������ٶ��ҵ���1000���������
*/
import java.util.Random;
class Homework1 
{
	public static void main(String[] args) 
	{
		int[] a = new int[10000];
		for(int i = 0;i < a.length;i++){
			Random r = new Random();
			a[i] = r.nextInt();
		}
	}
}
