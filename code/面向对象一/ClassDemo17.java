class ClassDemo17
{
	public static void main(String[] args) 
	{
		Person p = new Person(10,"aa");//先静态块,后定义初始化块,最后构造函数

		Person p1 = new Person(11,"bb");//静态块属于类,只要一份,只需加载一次
		//既然静态的东西属于类,那么是在创建对象的时候加载的吗?
		//不是,是在用到类就加载,且只加载一次,上面的情况是创建对象,因为创建对象也要用到类
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
	//static diqiu = 1;//每个人都拥有一个自己的地球---->静态定义初始化
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