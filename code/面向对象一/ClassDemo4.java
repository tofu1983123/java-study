class ClassDemo4 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(175,180,"zhangsan");//自动调用了构造函数
		System.out.println(p1.name+","+p1.h+","+p1.w);
		p1.eat();
		p1.walk();
		System.out.println("===============");
		Person p2 = new Person(170,176,"lisi");
		System.out.println(p2.name+","+p2.h+","+p2.w);
		p2.eat();
		p2.walk();
	}
}
class Person
{
	double h,w;
	String name;
	Person(double a,double b,String c){
		System.out.println("构造函数被调用...");
		h = a;
		w = b;
		name = c;
	}
	//成员函数可以访问其他成员
	void eat(){
		System.out.println(name+" is eating...");
	}
	void walk(){
		System.out.println(name+" is walking...");
	}
}
