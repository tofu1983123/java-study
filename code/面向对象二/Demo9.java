class Demo9 
{
	public static void main(String[] args) 
	{
		B b = new B();
		/*
			1.����B��Ķ���,�ȵ��ù��캯�� ---->����Ĺ��캯��
			Ĭ�ϻ���ø����޲����Ĺ��캯��
			2.this һ���Ǿ�̬��Ա�������ʷǾ�̬�ĳ�Աǰ��ʡ����this
			this���ǵ�ǰ����(A��ʵ��������),��������������Ǹ�����
			������������Ķ�����b
			�����˸��������,�����������ʵ��
			3.����test����,test����������д,���е�������ĺ���
			=======================================================
			4.��ʼ��˳��
				�ȸ���̬,�Ӿ�̬
				�������ʼ��,�����캯��
				�Ӷ����ʼ��,�ӹ��캯��
		*/
	}
}
class A
{
	A(){this.test();}
	void test(){System.out.println("hello");}
}
class B extends A
{
	//int i = 11;
	int i;
	{i = 11;System.out.println(i);}
	B(){}
	//void test(){System.out.println("world");}
	void test(){System.out.println(i);}
}