class ClassDemo13 
{
	public static void main(String[] args) 
	{
		//this的一种用法,参数名和成员名一样
		Person p1 = new Person(30,175,100,"zhangsan");
	}
}
class Person
{
	int age;double h,w;String name;
	Person(int age,double h,double w,String name){
		//这种情况下this不能省略
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
		System.out.println("点的坐标为:("+x+":"+y+")");
	}
}
