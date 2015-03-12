class Demo14 
{
	public static void main(String[] args) 
	{
		//A.accessA();
		A a = A.getInstance();
		a.print();
	}
}
class A
{
	private A(){}
	/*public static void accessA(){
		A a = new A();
		a.print();
	}*/
	public static A getInstance(){
		return new A();
	}
	public void print(){System.out.print("a...");}
}