class ClassDemo16 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//��ӡ1,1,1
		p1.diqiu = 2;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//��ӡ2,2,2
		Person.diqiu = 10;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//��ӡ10,10,10
	}
}
class Person
{
	int age;
	String name;//ÿ���˶����Լ�������,����
	int h = 175;//ÿ���˶����Լ������,���ǳ�ʼֵ��һ��
	//��ʾ����----����1�������
	//int diqiu = 1;//ÿ���˶�ӵ��һ���Լ��ĵ��� ��ʵ���������
	static int diqiu = 1;
}