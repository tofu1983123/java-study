class Demo2 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(new Point(10,10),10);
		c.printLocation();
		System.out.println(c.getArea());
		System.out.println("============");
		Rectangle r = new Rectangle(new Point(10,10),10,10);
		r.printLocation();
		System.out.println(r.getArea());
	}
}
class Shape
{
	Point location;
	Shape(Point location){
		this.location = location;
	}
	Shape(double x,double y){
		this(new Point(x,y));
	}
	double getArea(){return 0;}//这只是一个模拟,我们现在并不知道如何求面积
	double getLength(){return 0;}//也是一个模拟,一定有这个动作
	void printLocation(){
		System.out.println("我的位置是:"+location.x+","+location.y);
	}
}
class Rectangle extends Shape
{
	double w,h;
	Rectangle(Point location,double w,double h){
		super(location);
		this.w = w;
		this.h = h;
	}
	Rectangle(double x,double y,double w,double h){
		this(new Point(x,y),w,h);
	}
	boolean contains(Point p){
		double a = p.x - this.location.x;
		double b = p.y - this.location.y;
		return a >= 0 && a <= w && b >= 0 && b <= h;
	}
	double getArea(){return w * h;}
	double getLength(){return 2 * (w + h);}
}
class Circle extends Shape
{
	double r;
	Circle(Point location,double r){
		super(location);//调用了父类的构造函数
		this.r = r;
	}
	Circle(double x,double y,double r){
		this(new Point(x,y),r);
	}
	double getArea(){return 3.14 * r * r;}
	double getLength(){return 2 * 3.14 * r;}
}
class Point
{
	double x,y;
	Point(){}
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	double getDistance(){return Math.sqrt(x*x+y*y);}
	double getDistance(Point other){
		return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
	}
}