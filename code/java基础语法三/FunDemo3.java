class FunDemo3 
{
	public static void main(String[] args) 
	{
		int a1 = add(10,5);
		int b1 = add(15,20);
		System.out.println(a1+","+b1);
	}
	public static int add(int a,int b){
		int c = a + b;
		//��������о����������͵ķ���ֵ����(��void)
		//������return�ؼ��ַ���
		return c;
	}
}
