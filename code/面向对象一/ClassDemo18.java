class ClassDemo18 
{
	public static void main(String[] args) 
	{
		Test.f();//��̬�ķ��������ö���.���� ���ᳫ,Ҳ����ֱ��������.����
	}
}
class Test
{
	//static int i = 11;
	static int i;
	static{
		i = 11;
		System.out.println("hello");
	}
	static void f(){
		System.out.println("world");
	}
}