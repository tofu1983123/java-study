/*
	����,����
*/
class ArrayDemo11 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = new int[a.length];
		/*
			��һ������ Դ����
			�ڶ������� Դ������ĸ�λ�ÿ�ʼ
			���������� Ŀ������
			���ĸ����� �ŵ�Ŀ��������ĸ�λ��
			���ĸ����� ��������
		*/
		System.arraycopy(a,b);//(Դ����,0,Ŀ������,0,���鳤��)
		ArrayDemo7.printArray(b);
		int[] c = new int[a.length+1];
		System.arraycopy(a,0,c,0,3);
		ArrayDemo7.printArray(c);
	}
}
