class ClassDemo19 
{
	static{
		System.out.println("helloworld");
		System.exit(0);//退出程序.
	}//静态块,只加载一次
	//主函数本身就是静态的成员函数
	public static void main(String[] args) 
	{
		//静态块不一定是在创建对象的时候加载,是在第一次用的类就加载,并且只加载一次
		Person.printData();
	}
}
class Person
{
	//static int diqiu = 1;
	double h;
	static int diqiu;
	static{
		diqiu = 1;
		System.out.println("static...");
	}
	static void printData(){
		System.out.println(diqiu);
		//System.out.println(h);错误的,静态成员函数只能访问静态成员
	}
}