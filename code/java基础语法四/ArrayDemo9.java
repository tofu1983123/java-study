/*
	���������ֵ����Լ������С������(շת����----����ѧ�ر����)
	a.�ֱ��ҳ��������Ĺ�Լ��,���ֱ��������
	b.�ҳ�����,�������Լ��
	c.�������/���Լ��=��С������
*/
class ArrayDemo9 
{
	public static void main(String[] args) 
	{
		print(10,15);
	}
	public static void print(int a,int b){
		//�õ�a�Ĺ�Լ��
		int[] x1 = ArrayDemo7.getSons(a);//Integer.toBinaryString(10);
		ArrayDemo7.printArray(x1);
		//�õ�b�Ĺ�Լ��
		int[] x2 = ArrayDemo7.getSons(b);
		ArrayDemo7.printArray(x2);
		//�ҳ���ͬ������Ԫ�ؾ������Լ��
		int max = ArrayDemo8.getTheSameMax(x1,x2);
		//��С������
		int min = a * b / max;
		System.out.println(a+","+b+"�����Լ����:"+max+",��С��������:"+min);
	}
}
