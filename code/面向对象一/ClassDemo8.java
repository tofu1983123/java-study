class ClassDemo8 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(175,180,"zhangsan");
		Person p2 = new Person();//创建使用默认值的对象
		Person p3 = new Person(165,175);//调用带两个参数的构造函数
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
		System.out.println("调用带两个参数的构造函数...");
		h = a;
		w = b;
	}
	Person(){
		System.out.println("调用无参数的构造函数...");
	}
	//成员函数可以访问其他成员
	void eat(){
		System.out.println(name+" is eating...");
	}
	void walk(){
		System.out.println(name+" is walking...");
	}
}
