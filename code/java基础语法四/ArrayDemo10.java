/*
	��һ�������Ѿ���ʼ�����,���������±�3����һ��Ԫ��
*/
class ArrayDemo10 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		//��һ,�������һ��Ԫ��,����һ��Ԫ�������ǷŲ��µ�.
		//a[10] = 100;�����±�ֻ�ܵ�9,����10�����±��Խ����.
		//������
		int[] b = new int[11];
		//��a�����ݸ��Ƶ�b��
		for(int i = 0;i < a.length;i++){
			b[i] = a[i];
		}
		//ArrayDemo7.printArray(b);
		//�������ʹ��a,����������
		a = b;//ʹ��aָ����bָ�������
		for(int i = a.length-1;i > 3;i--){
			a[i] = a[i-1];
		}
		a[3] = 100;
		ArrayDemo7.printArray(a);
	}
}
