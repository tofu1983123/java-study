class ClassDemo17
{
	public static void main(String[] args) 
	{
		Person p = new Person(10,"aa");//�Ⱦ�̬��,�����ʼ����,����캯��

		Person p1 = new Person(11,"bb");//��̬��������,ֻҪһ��,ֻ�����һ��
		//��Ȼ��̬�Ķ���������,��ô���ڴ��������ʱ����ص���?
		//����,�����õ���ͼ���,��ֻ����һ��,���������Ǵ�������,��Ϊ��������ҲҪ�õ���
	}
}
class Person
{
	int age;
	String name;
	//int h = 175;
	int h;
	{
		h = 175;
		System.out.println("aa");
	}
	//static diqiu = 1;//ÿ���˶�ӵ��һ���Լ��ĵ���---->��̬�����ʼ��
	static int diqiu;
	static{
		diqiu = 1;
		System.out.println("bb...");
	}
	Person(int age,String name){
		this.age = age;
		this.name = name;
		System.out.println("cc");
	}
}