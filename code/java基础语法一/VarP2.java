class VarP2
{
	public static void main(String[] args)
	{
		//ʵ�����������������õ���������
		int a = 10 , b = 20;
		a = a + b;//����a��ʶ���ڴ��зŵ���a��b�ĺ�
		b = a - b;//a�Ѿ���a��b�ĺͣ��ټ�ȥb������ǰ��a�����ڸ�ֵ����b
		//��������b���Ѿ�����ǰ��a��
		a = a - b;//��ʽ�ұ�a���ܺͣ�b����ǰ��a�����֮��õ���ǰ��b
		//��ֵ����a
		System.out.println("a="+a+",b="+b);
	}
}