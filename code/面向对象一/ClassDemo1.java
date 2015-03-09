class ClassDemo1 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		p1.h = 175;
		p1.w = 200;

		p2.h = 165;
		p2.w = 180;

		p1.eat();
		p2.walk();
	}
}
class Person
{
	double h,w;
	int age;
	String name;
	void eat(){
		System.out.println("eating......");
	}
	void walk(){
		System.out.println("walking......");
	}
	//System.out.println("helloworld");//´íµÄ
}