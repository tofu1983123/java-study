class ClassDemo10 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(175,"zhangsan");
		//Person p2 = new Person(185,"lisi");
		p1.print();
		//p2.print();
	}
}
class Person
{
	//double h = 175;//�����ʼ��
	double h;
	{
		System.out.println("aa...");
		h = 175;
	}//�����ʼ����,ƽʱû�б�Ҫ����д.
	double w;
	String name;
	Person(double a,String c){
		w = a;
		name = c;
		System.out.println("bb...");
	}
	void print(){
		System.out.println(name+",���"+h+",����"+w);
	}
}