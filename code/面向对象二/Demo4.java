class Demo4 
{
	public static void main(String[] args) 
	{
		B b = new B();//控制台如何输出?
	}
}
class A
{
	static{System.out.println("aa...");}//静态定义初始化块
	{System.out.println("bb...");}//定义初始化块
	A(){System.out.println("cc...");}//构造函数
}
class B extends A
{
	static{System.out.println("dd...");}//静态定义初始化块
	{System.out.println("ee...");}//定义初始化块
	B(){System.out.println("ff...");}//构造函数
}