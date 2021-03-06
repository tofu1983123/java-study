class Demo1 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(10,10,10);
		System.out.println(c.getArea());
		c.printLocation();

		Rectangle r = new Rectangle(10,10,10,10);
		r.printLocation();
	}
}
class Shape
{
	Point location;
	double getArea(){return 0;}//这只是一个模拟,我们现在并不知道如何求面积
	double getLength(){return 0;}//也是一个模拟,一定有这个动作
	void printLocation(){
		System.out.println("我的位置是:"+location.x+","+location.y);
	}
}
class Rectangle extends Shape
{
	double w,h;
	Rectangle(double x,double y,double w,double h){
		this.location = new Point(x,y);
		this.w = w;
		this.h = h;
	}
	double getArea(){return w * h;}
	double getLength(){return 2 * (w + h);}
}
class Circle extends Shape
{
	double r;
	Circle(Point location,double r){
		this.location = location;
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
/*class Rectangle
{
	Point location;//在编程语言中,矩形一般都是由左上角坐标和w,h决定
	double w,h;
	Rectangle(){}
	Rectangle(Point location,double w,double h){
		super();
		this.location = location;
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
}*/
/*class Circle
{
	Point center;
	double r;
	//写构造函数
	Circle(Point center,double r){
		this.center = center;
		this.r = r;
	}
	//创建如下的构造函数
	Circle(double x,double y,double r){
		//this.center = new Point(x,y);
		//this.r = r;
		//直接调用上面的构造函数,可不可以呢?
		this(new Point(x,y),r);//调用重载中的另外一个构造函数,且放在第一句
	}
	//行为 求面积,求周长,是否包含一个点
	double getArea(){return 3.14 * r * r;}
	double getLength(){return 2 * 3.14 * r;}
	//圆是否包含点p,p到圆心的距离 <= r就在圆内,否则在圆外
	boolean contain(Point p){
		//求p到center的距离
		return center.getDistance(p) <= r;
	}
	boolean contain(double x,double y){
		//return center.getDistance(new Point(x,y));
		return contain(new Point(x,y));//this也可以省略
	}
}*/
