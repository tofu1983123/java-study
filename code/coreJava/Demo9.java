class Demo9 
{
	public static void main(String[] args) 
	{
		B b = new B();
		/*
			1.创建B类的对象,先调用构造函数 ---->子类的构造函数
			默认会调用父类无参数的构造函数
			2.this 一个非静态成员函数访问非静态的成员前面省略了this
			this又是当前对象(A的实例的引用),调用这个函数的那个对象
			调用这个函数的对象是b
			构成了父类的引用,引用了子类的实例
			3.调用test函数,test方法构成重写,所有调用子类的函数
			=======================================================
			4.初始化顺序
				先父静态,子静态
				父定义初始化,父构造函数
				子定义初始化,子构造函数
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