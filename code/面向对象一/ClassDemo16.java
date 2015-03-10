class ClassDemo16 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//打印1,1,1
		p1.diqiu = 2;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//打印2,2,2
		Person.diqiu = 10;
		System.out.println(p1.diqiu+","+p2.diqiu+","+Person.diqiu);//打印10,10,10
	}
}
class Person
{
	int age;
	String name;//每个人都有自己的年龄,名字
	int h = 175;//每个人都有自己的身高,但是初始值都一样
	//表示地球----整数1代表地球
	//int diqiu = 1;//每个人都拥有一个自己的地球 与实际生活不符合
	static int diqiu = 1;
}