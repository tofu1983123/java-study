class FunDemo9 
{
	public static void main(String[] args) 
	{
		int c = 10,d = 20;
		swap(c,d);
		System.out.println("c="+c+",d="+d);//�������c=10,d=20
		/*
			java��ʹ���ڴ�ʱ��ֱ�Ӱ��ڴ��Ϊ�ѡ�ջ
			���ڴ棬ͨ�����������������ڴ档
			ջ�ڴ棬�����Զ��ͷţ������Ƚ������
		*/
		int a = 30,b = 40;
		swap(a,b);
		System.out.println("a="+a+",b="+b);//�������a=30,b=40
	}
	//дһ������,ʵ�����������Ľ���.
	public static void swap(int a,int b){//int a = c;int b = d;
		int t = a;
		a = b;
		b = t;
	}
}
