class ClassDemo13 
{
	public static void main(String[] args) 
	{
		//this��һ���÷�,�������ͳ�Ա��һ��
		Person p1 = new Person(30,175,100,"zhangsan");
	}
}
class Person
{
	int age;double h,w;String name;
	Person(int age,double h,double w,String name){
		//���������this����ʡ��
		this.age = age;
		this.h = h;
		this.w = w;
		this.name = name;
	}
}
class Point
{
	double x,y;
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	Point(){
		
	}
	double getDistance(){
		return Math.sqrt(x*x+y*y);
	}
	void showLocation(){
		System.out.println("�������Ϊ:("+x+":"+y+")");
	}
}
