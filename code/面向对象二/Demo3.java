class Demo3 
{
	public static void main(String[] args) 
	{
		Man man = new Man();
	}
}
class Person
{
	Person(){
		System.out.println("hello");
	}
}
class Man extends Person
{
	Man(){
		System.out.println("world");
	}
}