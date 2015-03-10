class ClassDemo6
{
	public static void main(String[] args) 
	{
		//先创建加法器类的对象
		Adder adder = new Adder();
		System.out.println(adder.add(10,10));
		System.out.println(adder.add(10.5,10.3));
		System.out.println(adder.add(1,2,3));
	}
}
class Adder
{
	public int add(int a,int b){
		System.out.println("add1...");
		return a + b;
	}
	public int add(int a,int b,int c){
		System.out.println("三个参数...");
		return a + b + c;
	}
	public double add(double a,double b){
		System.out.println("double...");
		return a + b;
	}
}