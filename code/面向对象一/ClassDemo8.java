class ClassDemo8 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(175,180,"zhangsan");
		Person p2 = new Person();//����ʹ��Ĭ��ֵ�Ķ���
		Person p3 = new Person(165,175);//���ô����������Ĺ��캯��
	}
}
class Person
{
	double h,w;
	String name;
	Person(double a,double b,String c){
		h = a;
		w = b;
		name = c;
	}
	Person(double a,double b){
		System.out.println("���ô����������Ĺ��캯��...");
		h = a;
		w = b;
	}
	Person(){
		System.out.println("�����޲����Ĺ��캯��...");
	}
	//��Ա�������Է���������Ա
	void eat(){
		System.out.println(name+" is eating...");
	}
	void walk(){
		System.out.println(name+" is walking...");
	}
}
