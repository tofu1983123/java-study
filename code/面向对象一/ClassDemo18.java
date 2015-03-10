class ClassDemo18 
{
	public static void main(String[] args) 
	{
		Test.f();//静态的方法可以用对象.调用 不提倡,也可以直接用类名.调用
	}
}
class Test
{
	//static int i = 11;
	static int i;
	static{
		i = 11;
		System.out.println("hello");
	}
	static void f(){
		System.out.println("world");
	}
}